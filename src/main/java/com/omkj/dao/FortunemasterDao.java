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
 * {@link Fortunemaster}のDaoインタフェースです。
 * 
 * @author h_kim
 * @version 1.0
 */

@DomaRepository
@Dao
public interface FortunemasterDao {

	/**
	 * SQL文を呼び出す
	 * @return SQL文の結果
	 */
	@Select
	List<Fortunemaster> getSelectSQLfromFortunemaster();
	
	/**
	 * @param fortunemaster 運勢マスター
	 * @return 影響されたロー
	 */
	@Insert(sqlFile=true)
	int insertFortune(Fortunemaster fortunemaster);
	
    /**
     * @param unseicode 運勢コード
     * @return the Fortunemaster entity
     */
    @Select
    Fortunemaster selectById(String unseicode);

    /**
     * @param entity エンティティ
     * @return affected rows
     */
    @Insert
    int insert(Fortunemaster entity);

    /**
     * @param entity エンティティ
     * @return affected rows
     */
    @Update
    int update(Fortunemaster entity);

    /**
     * @param entity エンティティ
     * @return affected rows
     */
    @Delete
    int delete(Fortunemaster entity);
}