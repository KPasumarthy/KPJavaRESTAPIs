package com.kpjavapackage.mysql;

import java.util.List;
//import org.springframework.jdbc.core.JDbcTemplate;


/**
 * @author 	Kailash Pasumarthy
 * 			KP : Interface to implement HTTP CRUD Operations
 *				 CRUD : Interface 
 */
public interface WorldDAO {
	
	
	/**CRUD Methods : MVC Spring Framework Using <RowMapper> **/
	//Create : HTTP POST : DB Insert
	public int create(City city);

	//Retrieve : HTTP GET : DB Select
	public City get(Integer id);
		
	//Update : HTTP PUT : DB Update
	public int update(City city);
	
	//Delete : HTTP DELETE : DB Delete
	public int delete(Integer id);

	//List
	public List<City> list();
	/**CRUD Methods : MVC Spring Framework Using <RowMapper> **/
	
	
	/**CRUD Methods : MVC Spring Framework using <ResultSetExtractor> **/
	//Create : HTTP POST : DB Insert
	public int createRSExt(City city);

	//Retrieve : HTTP GET : DB Select
	public City getRSExt(Integer id);
		
	//Update : HTTP PUT : DB Update
	public int updateRSExt(City city);
	
	//Delete : HTTP DELETE : DB Delete
	public int deleteRSExt(Integer id);

	//List
	public List listRSExt();
	/**CRUD Methods : MVC Spring Framework using <ResultSetExtractor> **/

}
