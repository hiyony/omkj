package com.omkj.repository.dao;

import java.util.List;

import org.seasar.doma.Dao;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;

import com.omkj.entity.Omikujii;
import com.omkj.entity.OmikujiiSave;
import com.omkj.repository.DomaRepository;

@DomaRepository
@Dao
public interface OmikujiiDao {

	@Select
	int countSQLfromOmikujii();
	
	@Select
	List<OmikujiiSave> getresultSQLfromOmikujii(String omikujiID);
	
	@Insert(sqlFile = true)
	int insertOmikuji(Omikujii omikujii);
}
