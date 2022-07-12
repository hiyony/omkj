package com.omkj.dao;

import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Update;

import com.omkj.entity.SqlFeatures;

/**
 */
@Dao
public interface SqlFeaturesDao {

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(SqlFeatures entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(SqlFeatures entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(SqlFeatures entity);
}