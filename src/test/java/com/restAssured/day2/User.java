package com.restAssured.day2;

public class User {
	//Encapsulation 
	   private	String name;
	   private String job;
	   
	   //varaibles --> name of the keys
	    //to store value init --> createMethods(Getters and Setters)
	   
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getJob() {
			return job;
		}
		public void setJob(String job) {
			this.job = job;
		}

}
