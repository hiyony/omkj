package com.omkj.dao;

import java.util.List;

import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

import com.omkj.dao.repository.DomaRepository;
import com.omkj.entity.Omikujii;
import com.omkj.entity.OmikujiiSave;
import com.omkj.entity.PercentSave;

/**
 */
@DomaRepository
@Dao
public interface OmikujiiDao {
	
	@Select
	int countSQLfromOmikujii();
	
	@Select
	List<OmikujiiSave> getresultSQLfromOmikujii(String omikujiID);
	
	@Select
	List<PercentSave> getPercentResultList(String birthday);
	
	@Insert(sqlFile = true)
	int insertOmikuji(Omikujii omikujii);

    /**
     * @param omikujicode
     * @return the Omikujii entity
     */
    @Select
    Omikujii selectById(String omikujicode);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(Omikujii entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(Omikujii entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(Omikujii entity);
}