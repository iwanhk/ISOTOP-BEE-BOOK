package ${package.Mapper};

import ${package.Entity}.${entity};
import ${superMapperClassPackage};
import org.springframework.stereotype.Component;
import org.apache.ibatis.annotations.Mapper;
/**
* <p>
    * ${entity}Mapper 接口
    * </p>
*
* @author ${author}
* @since ${date}
*/
@Component
@Mapper
<#if kotlin>
interface ${table.mapperName} : ${superMapperClass}<${entity}>
<#else>
public interface ${table.mapperName} extends ${superMapperClass}<${entity}> {

    }
</#if>
