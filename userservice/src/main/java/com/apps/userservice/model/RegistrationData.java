package com.apps.userservice.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonInclude;

@Entity
@Table(name = "registration_data")
public class RegistrationData {

	@Id
	@Column(name = "registration_id", nullable = false)
	private String registrationId;
	@Column(name = "first_name", nullable = false)
	private String firstName;
	@Column(name = "last_name", nullable = false)
	private String lastName;
	@Column(name = "phone_number", nullable = false)
	private String phoneNumber;
	@Column(name = "email_address", nullable = false)
	private String emailAddress;
	@Column(name = "user_name", nullable = false)
	private String userName;
	@Column(name = "created_ts", nullable = false) @JsonInclude(JsonInclude.Include.NON_ABSENT)
	private Timestamp createdTs;
	@Column(name = "created_by", nullable = false) @JsonInclude(JsonInclude.Include.NON_ABSENT)
	private String createdBy;
	@Column(name = "updated_ts", nullable = false) @JsonInclude(JsonInclude.Include.NON_ABSENT)
	private Timestamp updatedTs;
	@Column(name = "updated_by", nullable = false)@JsonInclude(JsonInclude.Include.NON_ABSENT)
	private String updatedBy;
	
	public RegistrationData(){}

	public String getRegistrationId() {
		return registrationId;
	}

	public void setRegistrationId(String registrationId) {
		this.registrationId = registrationId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Timestamp getCreatedTs() {
		return createdTs;
	}

	public void setCreatedTs(Timestamp createdTs) {
		this.createdTs = createdTs;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Timestamp getUpdatedTs() {
		return updatedTs;
	}

	public void setUpdatedTs(Timestamp updatedTs) {
		this.updatedTs = updatedTs;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	};
	
	
}
