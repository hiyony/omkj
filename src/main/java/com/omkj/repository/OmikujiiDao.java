package com.omkj.repository;

import java.util.List;

import org.seasar.doma.Dao;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.boot.ConfigAutowireable;

import com.omkj.entity.Omikujii;

@ConfigAutowireable
@Dao
public interface OmikujiiDao {

	@Select
	int countSQLfromOmikujii();
	
	@Select
	List<Omikujii> getresultSQLfromOmikujii(String omikujiID);
	
	@Insert(sqlFile = true)
	int insertOmikuji(Omikujii omikujii);
}
