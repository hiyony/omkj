package com.omkj.dao;

import java.util.List;

import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

import com.omkj.dao.repository.DomaRepository;
import com.omkj.entity.Unseiresult;

/**
 */
@DomaRepository
@Dao
public interface UnseiresultDao {
	
	@Select
	List<Unseiresult> getcompareSQLfromUnseiresult(String todayString, String birthday);
	
	@Select
	List<Unseiresult> gethalfyearSQLfromUnseiresult(String checkdate, String birthday);
	
	@Insert(sqlFile = true)
	int insertResult(Unseiresult unseiresult);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(Unseiresult entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(Unseiresult entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(Unseiresult entity);
}