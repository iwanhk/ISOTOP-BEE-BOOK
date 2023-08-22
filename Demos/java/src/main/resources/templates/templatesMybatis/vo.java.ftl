package ${cfg.packageurl}.bean.tableVO;

<#list  table.importPackages as pkg>
    import ${pkg};
</#list>
<#if cfg.isAssociation>
<#list table.fields as field>
    <#if  (field.name?ends_with("_id")) >
    import  ${cfg.packageurl}.bean.tableDO.${field.name?replace("_id","")?cap_first};
        import com.kevin.change.bean.tableDO.Areas;
    </#if>
</#list>
</#if>
<#if swagger2>
    import io.swagger.annotations.ApiModel;
    import io.swagger.annotations.ApiModelProperty;
</#if>
<#if entityLombokModel>
    import lombok.Data;
</#if>
import com.baomidou.mybatisplus.annotation.*;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
* <p>
    * ${entity}VO对象
    * </p>
*
* @author ${author}
* @since ${date}
*/
<#if entityLombokModel>
    @Data
</#if>
@JsonIgnoreProperties(ignoreUnknown = true)
<#if swagger2>
    @ApiModel(value="${entity}对象", description="${table.comment}")
</#if>
public class ${entity}VO implements Serializable {
private static final long serialVersionUID = 1L;
<#-- ----------  BEGIN 字段循环遍历  ------------>
<#list  table.fields as field>
    <#if field.keyFlag>
        <#assign keyPropertyName=field.propertyName />
    </#if>
    <#if $!field.comment != "">
        <#if swagger2>
            @ApiModelProperty(value = "${field.comment}")
        <#else >
            /**
            * ${field.comment}
            */
        </#if>
    </#if>
    <#if field.keyFlag>
    <#--主键-->
        <#if field.keyIdentityFlag >
            @TableId(value = "${field.name}", type = IdType.AUTO)
        <#elseif !$null.isNull(idType) && $!idType != "">
            @TableId(value = "${field.name}", type = IdType.${idType})
        <#elseif field.convert >
            @TableId("${field.name}")
        </#if>
    <#--普通字段-->
    <#elseif field.fill?? >
    <#--  存在字段填充设置  -->
        <#if field.convert>
            @TableField(value = "${field.name}", fill = FieldFill.${field.fill})
        <#else >
            @TableField(fill = FieldFill.${field.fill})
        </#if>
    <#elseif field.convert>
        @TableField("${field.name}")
    </#if>
<#-- 乐观锁注解-->
    <#if (versionFieldName!"")==field.name >
        @Version
    </#if>
<#--   逻辑删除注解-->
    <#if (logicDeleteFieldName!"")==field.name>
        @TableLogic
        @TableField(select = false)
    </#if>
    <#if field.propertyType="Date">
        @JsonFormat(shape=JsonFormat.Shape.STRING,pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
        private Date ${field.propertyName};
    <#else >
        private ${field.propertyType} ${field.propertyName};
    </#if>
</#list>
<#------------  END 字段循环遍历  ------------>
<#------------  字段循环遍历 一对一对多 ------------>
<#if cfg.isAssociation>
<#list table.fields as field>
    <#if  field.name?ends_with("_id") >
        @ApiModelProperty(value = "${field.comment}实体")
        @TableField(exist = false)
        private  ${field.name?replace("_id","")?cap_first} ${field.name?replace("_id","")};
    </#if>
</#list>
</#if>
<#------------  END 字段循环遍历 一对一对多 ------------>

<#if !entityLombokModel>
    <#list  table.fields as field >
        <#if field.propertyType=="boolean">
            <#assign getprefix="is"/>
        <#else >
            <#assign getprefix="get"/>
        </#if>
        public ${field.propertyType} ${getprefix}${field.capitalName}() {
        return ${field.propertyName};
        }
        <#if entityBuilderModel>
            public ${entity} set${field.capitalName}(${field.propertyType} ${field.propertyName}) {
        <#else >
            public void set${field.capitalName}(${field.propertyType} ${field.propertyName}) {
        </#if>
        this.${field.propertyName} = ${field.propertyName};
        <#if entityBuilderModel>
            return this;
        </#if>
        }
    </#list>
</#if>

<#if entityColumnConstant>
    <#list   table.fields as field>
        public static final String ${field.name.toUpperCase()} = "${field.name}";
    </#list>
</#if>
<#if !entityLombokModel>
    @Override
    public String toString() {
    return "${entity}{" +
    <#list  table.fields as field>
        <#if field_index==0>
            "${field.propertyName}=" + ${field.propertyName} +
        <#else >
            ", ${field.propertyName}=" + ${field.propertyName} +
        </#if>
    </#list>
    "}";
    }
</#if>
}