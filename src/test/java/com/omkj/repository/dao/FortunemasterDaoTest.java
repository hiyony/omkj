package com.omkj.repository.dao;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.omkj.entity.Fortunemaster;
import com.omkj.service.FortunemasterServiceImpl;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:application.yml")
public class FortunemasterDaoTest {
	@Autowired
	FortunemasterServiceImpl fortunemasterServiceImpl;
	
	@SuppressWarnings("deprecation")
	@Test
	public void test_getSelectSQLfromFortunemaster() {
		List<Fortunemaster> samples = fortunemasterServiceImpl.getSelectSQLfromFortunemaster();
		
		Fortunemaster fm = samples.get(0);
		assertThat(fm.getUnseicode(), is("3"));
	}
}
