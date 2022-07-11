package com.omkj.repository.dao;

import java.util.List;

import org.seasar.doma.Dao;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;

import com.omkj.entity.Unseiresult;
import com.omkj.repository.DomaRepository;

@DomaRepository
@Dao
public interface UnseiresultDao {

	@Select
	List<Unseiresult> getcompareSQLfromUnseiresult(String todayString, String birthday);
	
	@Insert(sqlFile = true)
	int insertResult(Unseiresult unseiresult);
}
