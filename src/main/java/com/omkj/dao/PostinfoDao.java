package com.omkj.dao;

import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Update;

import com.omkj.entity.Postinfo;

/**
 */
@Dao
public interface PostinfoDao {

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(Postinfo entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(Postinfo entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(Postinfo entity);
}