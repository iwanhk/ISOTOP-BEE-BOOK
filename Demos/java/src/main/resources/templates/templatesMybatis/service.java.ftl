package ${package.Service};
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import ${package.Entity}.${entity};
import ${cfg.packageurl}.bean.parameterPM.${entity?lower_case}.${entity}Form;
import ${cfg.packageurl}.bean.parameterPM.${entity?lower_case}.${entity}PageForm;
import ${cfg.packageurl}.bean.parameterPM.${entity?lower_case}.${entity}UpdateForm;
import ${cfg.packageurl}.bean.tableVO.${entity}VO;
import ${cfg.packageurl}.bean.ResponseData;
import java.util.List;
import ${superServiceClassPackage};

/**
 * <p>
 * ${entity}服务类
 * </p>
 *
 * @author ${author}
 * @since ${date}
 */
<#if kotlin>
interface ${table.serviceName} : ${superServiceClass}<${entity}>
<#else>
public interface ${table.serviceName} extends ${superServiceClass}<${entity}> {
        /**
        * 保存信息对象
        * @param record 信息对象
        * @return 影响记录数
        */
        Integer save(${entity}Form record);

        /**
        * 根据主键更新信息对象
        * @param record 信息对象
        * @return 影响记录数
        */
        Integer updateById(${entity}UpdateForm record);

        /**
        * 根据主键删除信息对象
        * 逻辑删除,字段改为删除态
        * @param id 主键
        * @return 影响记录数
        */
        Integer deleteById(String id);

        /**
        * 根据主键查询信息对象
        * @param id 主键
        * @return 信息对象
        */
    ${entity}VO selectById(String id);

        /**
        * 根据主键查询信息对象
        * @param record 查询请求条件
        * @return 信息列表
        */
        List<${entity}VO> selectAll(${entity}Form record);

        /**
        * 分页查询信息对象
        * @param record 查询请求条件
        * @return 信息列表
        */
        IPage<${entity}VO> selectPage(${entity}PageForm record);

        /**
 * 分页查询信息对象
 * @param record 查询请求条件
 * @return 信息列表
 */
        IPage<${entity}VO> selectPage(${entity}PageForm record, QueryWrapper<${entity}> wrapper);
        }
</#if>