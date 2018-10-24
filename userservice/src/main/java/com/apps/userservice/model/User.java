package com.apps.userservice.model;

public class User {

	private Integer id;
	private String firstName;
	private String lastName;

	public Integer getId(){
		return this.id;
	}
	public String getFirstName(){
		return this.firstName;
	}
	public String getLastName(){
		return this.lastName;
	}
	public void setId(Integer id){
		this.id = id;
	}
	public void setFirstName(String firstName){
		this.firstName = firstName;
	}
	public void setLastName(String lastName){
		this.lastName = lastName;
	}
}