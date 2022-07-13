package com.omkj.dao;

import java.util.List;

import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

import com.omkj.dao.repository.DomaRepository;
import com.omkj.entity.Postinfo;

/**
 */
@DomaRepository
@Dao
public interface PostinfoDao {
	
	@Select
	List<Postinfo> getresultSQLfromPinfo(String zcode);

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