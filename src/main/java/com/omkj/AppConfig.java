package com.omkj;

import javax.sql.DataSource;

import org.seasar.doma.jdbc.Config;
import org.seasar.doma.jdbc.dialect.Dialect;
import org.seasar.doma.jdbc.dialect.PostgresDialect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	
	@Autowired
	private DataSource dataSource;
	
	@Bean
	public Config domaConfig() {
		return new Config() {

			@Override
			public DataSource getDataSource() {
				return dataSource;
			}

			@Override
			public Dialect getDialect() {
				return new PostgresDialect();
			}
			
		};
	}
}
