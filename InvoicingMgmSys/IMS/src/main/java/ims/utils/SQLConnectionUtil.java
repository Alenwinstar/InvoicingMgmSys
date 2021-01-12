package ims.utils;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

@Configuration
public class SQLConnectionUtil {
	
	@Autowired
	private DataSource dataSource;
	
	public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }
	
	public DataSource getDataSource() {
		return dataSource;
	}
	
//	public Integer insert(String sqlstate) {
//		Integer result=0;
//		try(
//				Connection conn = dataSource.getConnection();
//				Statement state = conn.createStatement();
//				){
//			
//		} catch(SQLException e) {
//			e.printStackTrace();
//		}
//		return result;
//	}
}
