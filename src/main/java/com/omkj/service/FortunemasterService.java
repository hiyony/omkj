package com.omkj.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.omkj.entity.Fortunemaster;

/**
 * {@link Fortunemaster}のサービスインタフェースです。
 * 
 * @author h_kim
 * @version 1.0
 */
@Service
@Transactional
public interface FortunemasterService {
	
	/**
	 * fortunemasterテーブルにアクセスするメソッド
	 * @return SQL文の結果
	 */
	public List<Fortunemaster> getSelectSQLfromFortunemaster();
	
}
