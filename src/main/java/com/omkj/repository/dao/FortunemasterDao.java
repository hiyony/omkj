package com.omkj.repository.dao;

import java.util.List;

import org.seasar.doma.Dao;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;

import com.omkj.entity.Fortunemaster;
import com.omkj.repository.DomaRepository;

@DomaRepository
@Dao
public interface FortunemasterDao {
	
	@Select
	List<Fortunemaster> getSelectSQLfromFortunemaster();

	@Insert(sqlFile = true)
	int insertFortune(Fortunemaster fortunemaster);
}
