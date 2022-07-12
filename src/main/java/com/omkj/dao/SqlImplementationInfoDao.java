package com.omkj.dao;

import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Update;

import com.omkj.entity.SqlImplementationInfo;

/**
 */
@Dao
public interface SqlImplementationInfoDao {

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(SqlImplementationInfo entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(SqlImplementationInfo entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(SqlImplementationInfo entity);
}