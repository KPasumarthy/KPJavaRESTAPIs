package com.kpjavapackage.mysql;
//package com.kpjavapackage.mysql.model;
//package com.kpjavapackage.mysql;
//package com.kpjavapackage.mysql.model;

import java.lang.Object;

public class City {

	//public City() {
		// TODO Auto-generated constructor stub
		private Integer id;				// ID int AI PK 
		private String 	name;			// Name char(35) 
		private String 	countrycode;	// CountryCode char(3) 
		private	String 	district;		// District char(20) 
		private Integer population;		// Population int
		
		//Class Constructor : Model City 
		//protected City(Integer id, String name, String countrycode, String district, Integer population) {
		//	super();
		//	this.id = id;
		//	this.name = name;
		//	this.countrycode = countrycode;
		//	this.district = district;
		//	this.population = population;
		//}
		public City() {}
		
		//Properties Setter & Getters 
		//Property ID : Getters 
		public Integer getId() {
			return id;
		}
		//Property ID : Setters 
		public void setId(Integer id) {
			this.id = id;
		}
		//Property Name : Getters 
		public String getName() {
			return name;
		}
		//Property Name : Setters 
		public void setName( String name) {
			this.name = name;
		}
		//Property CountryCode : Getters 
		public String getcountrycode() {
			return countrycode;
		}
		//Property CountryCode : Setters 
		public void setCountryCode( String countrycode) {
			this.countrycode = countrycode;
		}
		//Property District : Getters 
		public String getDistrict() {
			return district;
		}
		//Property District : Setters 
		public void setDistrict( String district) {
			this.district = district;
		}
		//Property Pouplation : Getters 
		public Integer getPopulation() {
			return population;
		}
		//Property Pouplation : Setters 
		public void setPopulation( Integer population) {
			this.population = population;
		}
}
