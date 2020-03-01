package com.kpjavapackage.mysql;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

class WorldDAOTest {
	
	private static DriverManagerDataSource dataSource;
	private WorldDAO dao;


	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost/world");
		dataSource.setUsername("kailash");
		dataSource.setPassword("(kp27SN27kp)");
		dao = new WorldDAOImpl(dataSource);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	/**
	 * KP : MySQL DataAccessObject - MySQLDB World : RowMapper 
	 */
	@Test
	void testCreate() {
		fail("Not yet implemented");
	}

	@Test
	void testGet() {
		int id = 27; 	//KP : City Id = 27
		City city = dao.get(27);
	
        //Display values on console
        System.out.print("ID: " + city.getId());
        System.out.print(", Name: " + city.getName());
        System.out.print(", CountryCode: " + city.getcountrycode());
        System.out.print(", District: " + city.getDistrict());
        System.out.println(", Population: " + city.getPopulation());
		
		assertTrue(city != null);		
	}

	@Test
	void testUpdate() {
		fail("Not yet implemented");
	}

	@Test
	void testDelete() {
		fail("Not yet implemented");
	}

	@Test
	void testList() {
		List<City> cities = dao.list();
        for (int i = 0; i < cities.size(); i++) {
        	
    		City city = cities.get(i);
    		
            //Display values on console
            System.out.print("ID: " + city.getId());
            System.out.print(", Name: " + city.getName());
            System.out.print(", CountryCode: " + city.getcountrycode());
            System.out.print(", District: " + city.getDistrict());
            System.out.println(", Population: " + city.getPopulation());
    		
    		assertTrue(city != null);
        }
		
		assertTrue(cities != null);		
	}
	/**
	 * KP : MySQL DataAccessObject - MySQLDB World : RowMapper 
	 */
	
	
	/**
	 * KP : MySQL DataAccessObject - MySQLDB World : ResultSetExtractor
	 */
	@Test
	void testCreateRSExt() {
		fail("Not yet implemented");
	}

	@Test
	void testGetRSExt() {
		int id = 27; 	//KP : City Id = 27
		City city = dao.getRSExt(27);
	
        //Display values on console
        System.out.print("ID: " + city.getId());
        System.out.print(", Name: " + city.getName());
        System.out.print(", CountryCode: " + city.getcountrycode());
        System.out.print(", District: " + city.getDistrict());
        System.out.println(", Population: " + city.getPopulation());
		
		assertTrue(city != null);		
	}

	@Test
	void testUpdateRSExt() {
		fail("Not yet implemented");
	}

	@Test
	void testDeleteRSExt() {
		fail("Not yet implemented");
	}

	@Test
	void testListRSExt() {
		List cities = dao.listRSExt();
        for (int i = 0; i < cities.size(); i++) {
        	
    		City city = (City) cities.get(i);
    		
            //Display values on console
            System.out.print("ID: " + city.getId());
            System.out.print(", Name: " + city.getName());
            System.out.print(", CountryCode: " + city.getcountrycode());
            System.out.print(", District: " + city.getDistrict());
            System.out.println(", Population: " + city.getPopulation());
    		
    		assertTrue(city != null);
        }
		
		assertTrue(cities != null);		
	}
	/**
	 * KP : MySQL DataAccessObject - MySQLDB World : ResultSetExtractor
	 */
	
	
}
