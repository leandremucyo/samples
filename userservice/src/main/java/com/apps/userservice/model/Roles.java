package com.apps.userservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "roles")
public class Roles {
	
	@Id
	@Column(name = "role_id", nullable = false)
	@GeneratedValue
	private Long roleId;
	@Column(name = "role_name", nullable = false)
	private String roleName;
	@Column(name = "edit_enabled", nullable = false)
	private String editEnabled;
	@Column(name = "add_enabled", nullable = false)
	private String addEnabled;
	@Column(name = "remove_enabled", nullable = false)
	private String removeEnabled;
	
	public Roles(){}

	public Roles(String roleName, String editEnabled, String addEnabled, String removeEnabled) {
		super();
		this.roleName = roleName;
		this.editEnabled = editEnabled;
		this.addEnabled = addEnabled;
		this.removeEnabled = removeEnabled;
	}

	public Long getRoleId() {
		return roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getEditEnabled() {
		return editEnabled;
	}

	public void setEditEnabled(String editEnabled) {
		this.editEnabled = editEnabled;
	}

	public String getAddEnabled() {
		return addEnabled;
	}

	public void setAddEnabled(String addEnabled) {
		this.addEnabled = addEnabled;
	}

	public String getRemoveEnabled() {
		return removeEnabled;
	}

	public void setRemoveEnabled(String removeEnabled) {
		this.removeEnabled = removeEnabled;
	}
	

}
