package edu.pdx.advocate.dao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;

public class AdvocateDao {
	@Autowired
	private DataSource dataSource;

	public String getTestSTring() {
		return "TEST!";
	}

	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
}
