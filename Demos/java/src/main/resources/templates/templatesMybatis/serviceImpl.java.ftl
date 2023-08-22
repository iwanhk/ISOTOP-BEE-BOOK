package ${package.ServiceImpl};

import ${package.Entity}.${entity};
import ${cfg.packageurl}.bean.parameterPM.${entity?lower_case}.${entity}Form;
import ${cfg.packageurl}.bean.parameterPM.${entity?lower_case}.${entity}PageForm;
import ${cfg.packageurl}.bean.parameterPM.${entity?lower_case}.${entity}UpdateForm;
import ${cfg.packageurl}.bean.tableVO.${entity}VO;
import ${cfg.packageurl}.bean.ResponseResult;
import ${package.Mapper}.${table.mapperName};
import ${package.Service}.${table.serviceName};
import ${superServiceImplClassPackage};
import lombok.SneakyThrows;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.util.CollectionUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import cn.hutool.core.exceptions.ValidateException;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import org.apache.commons.lang3.StringUtils;
/**
* <p>
    * ${entity}服务实现类
    * </p>
*
* @author ${author}
* @since ${date}
*/
@Service
<#if kotlin>
    open class ${table.serviceImplName} : ${superServiceImplClass}<${table.mapperName}, ${entity}>(), ${table.serviceName} {

    }
<#else>
    public class ${table.serviceImplName} extends ${superServiceImplClass}<${table.mapperName}, ${entity}> implements ${table.serviceName} {
    @Override
    public Integer save(${entity}Form record) {
    ${entity} data = this.convertDO(record);
    data.setCreateTime(new Date());
    return baseMapper.insert(data);
    }
    @Override
    public Integer updateById(${entity}UpdateForm record) {
    ${entity} data = this.convertDO(record);
    data.setUpdateTime(new Date());
    return baseMapper.updateById(data);
    }
    @SneakyThrows
    @Override
    public Integer deleteById(String id) {
    if(StringUtils.isBlank(id)){
    throw new ValidateException(ResponseResult.PARAM_EMPTY);
    }
    return baseMapper.deleteById(id);
    }
    @SneakyThrows
    @Override
    public ${entity}VO selectById(String id) {
    if(StringUtils.isBlank(id)){
    throw new ValidateException(ResponseResult.PARAM_EMPTY);
    }
    ${entity} data = baseMapper.selectById(id);
    if(data==null){
    return null;
    }
    ${entity}VO vo = new ${entity}VO();
    BeanUtils.copyProperties(data,vo);
    return vo;
    }

    @Override
    public List<${entity}VO> selectAll(${entity}Form record) {
        ${entity} data = this.convertDO(record);
        QueryWrapper<${entity}> queryWrapper = new QueryWrapper<>();
        queryWrapper.setEntity(data);
        List<${entity}> list = baseMapper.selectList(queryWrapper);
        return this.convert(list);
        }

    @Override
    public IPage<${entity}VO> selectPage(${entity}PageForm record) {
            // form -> do 转换
            ${entity} data = this.convertDO(record);
            // 分页数据设置
            Page<${entity}> page = new Page<>(record.getCurrent(),record.getSize());
            // 查询条件
            QueryWrapper<${entity}> queryWrapper = new QueryWrapper<>();
            queryWrapper.setEntity(data);
            IPage<${entity}> list = baseMapper.selectPage(page, queryWrapper);
            IPage<${entity}VO> iPage = new Page<>();
                iPage.setRecords(this.convert(list.getRecords()));
                iPage.setCurrent(list.getCurrent());
                iPage.setSize(list.getSize());
                iPage.setTotal(list.getTotal());
                iPage.setPages(list.getPages());
                return iPage;
                }
     @Override
     public IPage<${entity}VO> selectPage(${entity}PageForm record, QueryWrapper<${entity}> queryWrapper) {
                    // form -> do 转换
                ${entity} data = this.convertDO(record);
                    // 分页数据设置
                    Page<${entity}> page = new Page<>(record.getCurrent(),record.getSize());
                    // 查询条件
                    IPage<${entity}> list = baseMapper.selectPage(page, queryWrapper);
                    IPage<${entity}VO> iPage = new Page<>();
                        iPage.setRecords(this.convert(list.getRecords()));
                        iPage.setCurrent(list.getCurrent());
                        iPage.setSize(list.getSize());
                        iPage.setTotal(list.getTotal());
                        iPage.setPages(list.getPages());
                        return iPage;
                        }


                        /**
                        * Form -> Do
                        * @param form 对象
                        * @return Do对象
                        */
                        private ${entity} convertDO(${entity}PageForm form){
                        ${entity} data = new ${entity}();
                        <#list  table.fields as field>
                            <#if (logicDeleteFieldName!"")!=field.name&&(field.propertyName!"")!= "createTime"&&(field.propertyName!"")!= "updateTime"&&!field.keyIdentityFlag>
                                data.set${field.capitalName}(form.get${field.capitalName}());
                            </#if>
                        </#list>
                        return data;
                        }
                        /**
                        * Form -> Do
                        * @param form 对象
                        * @return Do对象
                        */
                        private ${entity} convertDO(${entity}Form form){
                        ${entity} data = new ${entity}();

                        <#list  table.fields as field>
                            <#if (logicDeleteFieldName!"")!=field.name&&"createTime"!=field.propertyName &&(field.propertyName!"")!= "updateTime"&&!field.keyIdentityFlag>
                                <#if field.propertyType=="Date1">
                        data.set${field.capitalName}(DateUtil.parseDateNewFormat(form.get${field.capitalName}()));
                                <#else >
                        data.set${field.capitalName}(form.get${field.capitalName}());
                                </#if>
                            </#if>
                        </#list>
                        return data;
                        }
                        /**
                        * Form -> Do
                        * @param form 对象
                        * @return Do对象
                        */
                        private ${entity} convertDO(${entity}UpdateForm form){
                        ${entity} data = new ${entity}();
                        <#list  table.fields as field>
                            <#if (logicDeleteFieldName!"")!=field.name&&"createTime"!=field.propertyName &&(field.propertyName!"")!= "updateTime">
                                <#if field.propertyType=="Date1">
                                    data.set${field.capitalName}(DateUtil.parseDateNewFormat(form.get${field.capitalName}()));
                                <#else >
                                    data.set${field.capitalName}(form.get${field.capitalName}());
                                </#if>
                            </#if>
                        </#list>
                        return data;
                        }
                        /**
                        * Do -> VO
                        * @param list 对象
                        * @return VO对象
                        */
                        private List<${entity}VO> convert(List<${entity}> list){
                            List<${entity}VO> ${table.entityPath}List = new ArrayList<>();
                                if (CollectionUtils.isEmpty(list)) {
                                return ${table.entityPath}List;
                                }
                                for (${entity} source : list) {
                                ${entity}VO target = new ${entity}VO();
                                BeanUtils.copyProperties(source, target);
                                ${table.entityPath}List.add(target);
                                }
                                return ${table.entityPath}List;
                                }
     }
</#if>