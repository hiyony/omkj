package com.omkj.dao;

import java.util.List;

import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

import com.omkj.dao.repository.DomaRepository;
import com.omkj.entity.Postinfo;

/**
 * {@link Postinfo}のDaoインタフェースです。
 * 
 * @author h_kim
 * @version 1.0
 */

@DomaRepository
@Dao
public interface PostinfoDao {
	
	/**
	 * SQL文を呼び出す
	 * @param zcode 郵便番号
	 * @return SQL文の結果
	 */
	@Select
	List<Postinfo> getresultSQLfromPinfo(String zcode);
	
	/**
	 * SQL文を呼び出す
	 * @param homeaddress 住所
	 * @param replaceaddress 区別された住所
	 * @return SQL文の結果
	 */
	@Select
	List<Postinfo> getzipcodeSQLfromPinfo(String homeaddress, String replaceaddress);

    /**
     * @param entity エンティティ
     * @return affected rows
     */
    @Insert
    int insert(Postinfo entity);

    /**
     * @param entity エンティティ
     * @return affected rows
     */
    @Update
    int update(Postinfo entity);

    /**
     * @param entity エンティティ
     * @return affected rows
     */
    @Delete
    int delete(Postinfo entity);
}