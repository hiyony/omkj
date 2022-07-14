package com.omkj.dao;

import java.util.List;

import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

import com.omkj.dao.repository.DomaRepository;
import com.omkj.entity.Save;

/**
 * {@link Save}のDaoインタフェースです。
 * 
 * @author h_kim
 * @version 1.0
 */
@DomaRepository
@Dao
public interface SaveDao {

	/**
	 * SQL文を呼び出す
	 * @return SQL文の結果
	 */
	@Select
	List<Save> getresultjSQLfromSave();
	
	/**
	 * @param save エンティティ
	 * @return 影響されたロー
	 */
	@Insert(sqlFile = true)
	int insertSavings(Save save);
    
	/**
     * @param entity エンティティ
     * @return affected rows
     */
    @Insert
    int insert(Save entity);

    /**
     * @param entity エンティティ
     * @return affected rows
     */
    @Update
    int update(Save entity);

    /**
     * @param entity エンティティ
     * @return affected rows
     */
    @Delete
    int delete(Save entity);
}