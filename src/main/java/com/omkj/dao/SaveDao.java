package com.omkj.dao;

import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Update;

import com.omkj.entity.Save;

/**
 */
@Dao
public interface SaveDao {

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(Save entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(Save entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(Save entity);
}