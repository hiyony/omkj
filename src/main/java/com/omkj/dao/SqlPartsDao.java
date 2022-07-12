package com.omkj.dao;

import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Update;

import com.omkj.entity.SqlParts;

/**
 */
@Dao
public interface SqlPartsDao {

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(SqlParts entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(SqlParts entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(SqlParts entity);
}