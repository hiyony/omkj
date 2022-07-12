package com.omkj.dao;

import java.util.List;

import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

import com.omkj.dao.repository.DomaRepository;
import com.omkj.entity.Fortunemaster;

/**
 */
@DomaRepository
@Dao
public interface FortunemasterDao {

	@Select
	List<Fortunemaster> getSelectSQLfromFortunemaster();
	
	@Insert(sqlFile=true)
	int insertFortune(Fortunemaster fortunemaster);
	
    /**
     * @param unseicode
     * @return the Fortunemaster entity
     */
    @Select
    Fortunemaster selectById(String unseicode);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(Fortunemaster entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(Fortunemaster entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(Fortunemaster entity);
}