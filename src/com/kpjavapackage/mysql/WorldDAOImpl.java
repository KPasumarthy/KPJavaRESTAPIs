/**
 * 
 */
package com.kpjavapackage.mysql;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;
import java.sql.*;
import java.sql.ResultSet;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.*;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.junit.jupiter.api.Assertions.*;

/**
 * @author admin
 *
 */
public class WorldDAOImpl implements WorldDAO {

	private JdbcTemplate jdbcTemplate;
	
	/**
	 * KP : MySQL DataAccessObject - MySQLDB World
	 */
	public WorldDAOImpl(DataSource ds) {
		// TODO Auto-generated constructor stub
		this.jdbcTemplate = new JdbcTemplate(ds);
	}

	/**
	 * KP : MySQL DataAccessObject - MySQLDB World : RowMapper 
	 */
	@Override
	public int create(City city) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public City get(Integer id) {
		
		// TODO Auto-generated method stub
		// TODO : Spring MVC : JDBC Template Examples : https://docs.spring.io/spring/docs/2.0.x/reference/jdbc.html
		String sql = "Select * From World.City Where ID = ? "; 
		City city = new City();
		city =  (City) jdbcTemplate.queryForObject(
		    			sql,
		    			new Object[]{new Integer(id)}, 
		    			new RowMapper() {
			   				 public Object mapRow(ResultSet rs, int rowNum) throws SQLException { 
			   					 City city = new City();
			   					 city.setId(rs.getInt("ID"));
			   					 city.setName(rs.getString("Name"));
			   					 city.setCountryCode(rs.getString("CountryCode"));
			   					 city.setDistrict(rs.getString("District"));
			   					 city.setPopulation(rs.getInt("Population"));
			   					 
			   					 return city;
			   				 }
		    			});		 				 
        return city;
	}
	
	@Override
	public int update(City city) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<City> list() {
		// TODO Auto-generated method stub
		// TODO : Spring MVC : JDBC Template Examples : https://docs.spring.io/spring/docs/2.0.x/reference/jdbc.html
		String sql = "Select * From World.City"; 
		List<City> cities = (List<City>) jdbcTemplate.query( sql, new CityrMapper() );
		return cities;
	}

	private static final class CityrMapper implements RowMapper {
	
	    public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
				 City city = new City();
				 city.setId(rs.getInt("ID"));
				 city.setName(rs.getString("Name"));
				 city.setCountryCode(rs.getString("CountryCode"));
				 city.setDistrict(rs.getString("District"));
				 city.setPopulation(rs.getInt("Population"));			   					 
				 return city;
	    }
	}
	/**
	 * KP : MySQL DataAccessObject - MySQLDB World : RowMapper 
	 */
	
	
	/**
	 * KP : MySQL DataAccessObject - MySQLDB World : ResultSetExtractor
	 */
	@Override
	public int createRSExt(City city) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public City getRSExt(Integer id) {
		// TODO Auto-generated method stub
		// TODO : Spring MVC : JDBC Template Examples : https://docs.spring.io/spring/docs/2.0.x/reference/jdbc.html
		String sql = "Select * From World.City Where ID = " + id; 
		
		ResultSetExtractor<City> rsExtractor = new ResultSetExtractor<City>() {	
		    public City extractData(ResultSet rs) throws SQLException, DataAccessException {
		    	if(rs.next()) {
					 City city = new City();
					 city.setId(rs.getInt("ID"));
					 city.setName(rs.getString("Name"));
					 city.setCountryCode(rs.getString("CountryCode"));
					 city.setDistrict(rs.getString("District"));
					 city.setPopulation(rs.getInt("Population"));			   					 
					 return city;
		    	}
		    	return null;
		    }
		};
	    return jdbcTemplate.query(sql, rsExtractor);
	}


	@Override
	public int updateRSExt(City city) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteRSExt(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public  List listRSExt() {
		// TODO Auto-generated method stub
		// TODO : Spring MVC : JDBC Template Examples : https://docs.spring.io/spring/docs/2.0.x/reference/jdbc.html
		String sql = "Select * From World.City"; 
		
		ResultSetExtractor<List> rsExtractor = new ResultSetExtractor<List>() {	
		    public List extractData(ResultSet rs) throws SQLException, DataAccessException {
		    	//List cities = new ArrayList();
		    	List<City> citiesRS = null;
		    	if(rs.next()) {
					 City city = new City();
					 city.setId(rs.getInt("ID"));
					 city.setName(rs.getString("Name"));
					 city.setCountryCode(rs.getString("CountryCode"));
					 city.setDistrict(rs.getString("District"));
					 city.setPopulation(rs.getInt("Population"));	
					 
					 citiesRS.add(city);
		    	}
		    	return citiesRS;
		    }
		};
		
		List cities = jdbcTemplate.query(sql, rsExtractor);
	    return cities;
	}
	
	/*
	 * // Implementing Custom ResultSetExtractor To Fetch Data From The Db public
	 * List getAllEditors() { return templateObj.query("SELECT * FROM tech_editors",
	 * new ResultSetExtractor<List>() { public List extractData(ResultSet
	 * resultSetObj) throws SQLException, DataAccessException { List editorList =
	 * new ArrayList(); while(resultSetObj.next()) { TechEditor techEditorObj = new
	 * TechEditor(); techEditorObj.setEditor_id(resultSetObj.getInt(1));
	 * techEditorObj.setEditor_name(resultSetObj.getString("name"));
	 * techEditorObj.setEditor_salary(resultSetObj.getFloat(3));
	 * editorList.add(techEditorObj); } return editorList; } }); }
	 */
	
	/**
	 * KP : MySQL DataAccessObject - MySQLDB World : RowMapper 
	 */

}
