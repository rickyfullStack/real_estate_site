package com.realEstate.entity;

import javax.persistence.*;

@Entity
@Table(name = "agent")
public class Agent {
	@Id
	@Column(name = "id")
	private Integer id;

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

	@Column(name = "phonenumber")
	private long agentPhoneNum;

	@Column(name = "email")
	private String email;

	@Column(name = "password")
	private String password;
	
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "property_id")
//	private Property property;

	public Agent() {
	}

	public Agent(Integer id, String firstName, String lastName, long agentPhoneNum, String email, String password) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.agentPhoneNum = agentPhoneNum;
		this.email = email;
		this.password = password;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public long getAgentPhoneNum() {
		return agentPhoneNum;
	}

	public void setAgentPhoneNum(long agentPhoneNum) {
		this.agentPhoneNum = agentPhoneNum;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Agent [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", agentPhoneNum="
				+ agentPhoneNum + ", email=" + email + ", password=" + password + ", property=";
	}

}