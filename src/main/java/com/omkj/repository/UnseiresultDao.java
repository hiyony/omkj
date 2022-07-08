package com.omkj.repository;

import java.util.List;

import org.seasar.doma.Dao;
import org.seasar.doma.Select;
import org.seasar.doma.boot.ConfigAutowireable;

import com.omkj.entity.Unseiresult;

@ConfigAutowireable
@Dao
public interface UnseiresultDao {

	@Select
	List<Unseiresult> getcompareSQLfromUnseiresult(String todayString, String birthday);
}
