package com.arawn.cms.dao;

import com.arawn.cms.entity.Jar;

import java.util.List;
import java.util.Map;

/**
 * Jar包Dao接口
 * Created by ArawN on 2017/12/3.
 */
public interface JarDao {

    /**
     * 根据jarId查询
     * @param jarId
     * @return
     */
    Jar queryByJarId(String jarId);

    /**
     * 添加Jar包信息
     * @param jar
     * @return
     */
    int insert(Jar jar);

    /**
     * 根据jarId修改Jar包信息
     * @param jar
     * @return
     */
    int updateByJarId(Jar jar);

    /**
     * 根据条件查询列表
     * @param map
     * @return
     */
    List<Jar> listByMap(Map<String, Object> map);

    /**
     * 根据条件查询记录数
     * @param map
     * @return
     */
    Long countByMap(Map<String, Object> map);

    /**
     * 根据jarId删除
     * @param jarId
     * @return
     */
    int deleteByJarId(String jarId);
}
