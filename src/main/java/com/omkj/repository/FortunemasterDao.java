package com.omkj.repository;

import java.util.List;

import org.seasar.doma.Dao;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.boot.ConfigAutowireable;

import com.omkj.entity.Fortunemaster;

@ConfigAutowireable
@Dao
public interface FortunemasterDao {
	
	@Select
	List<Fortunemaster> getSelectSQLfromFortunemaster();

	@Insert(sqlFile = true)
	int insertFortune(Fortunemaster fortunemaster);
}
