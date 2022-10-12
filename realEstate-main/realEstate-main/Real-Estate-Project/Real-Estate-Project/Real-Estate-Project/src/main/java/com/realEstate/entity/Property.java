package com.realEstate.entity;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "property")
public class Property {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	@Column(name = "street")
	private String street;

	@Column(name = "city")
	private String city;

	@Column(name = "state")
	private String state;

	@Column(name = "zipcode")
	private Integer zip;

	@Column(name = "house_size")
	private Integer houseSize;

	@Column(name = "sale_price")
	private Integer salePrice;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "agent_id")
	private Agent agent;

	@Column(name = "date_posted")
	private LocalDate datePosted;
//	
//	@ManyToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name="purchaser_client_id")
//	private Integer purchaserClientId;

	public Property() {

	}

	public Property(Integer id, String street, String city, String state, Integer zip, Integer houseSize,
			Integer salePrice, Agent agent, LocalDate datePosted ) {
		super();
		this.id = id;
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.datePosted = datePosted;
		this.houseSize = houseSize;
		this.salePrice = salePrice;
		this.agent = agent;
		this.datePosted = datePosted;
//		this.purchaserClientId = purchaserClientId;
	}

//	public Integer getPurchaserClientId() {
//		return purchaserClientId;
//	}
//
//	public void setPurchaserClientId(Integer purchaserClientId) {
//		this.purchaserClientId = purchaserClientId;
//	}

	public void setDatePosted(LocalDate datePosted) {
		this.datePosted = datePosted;
	}

	public LocalDate getDatePosted() {
		return datePosted;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Integer getZip() {
		return zip;
	}

	public void setZip(Integer zip) {
		this.zip = zip;
	}

	public Integer getHouseSize() {
		return houseSize;
	}

	public void setHouseSize(Integer houseSize) {
		this.houseSize = houseSize;
	}

	public Integer getSalePrice() {
		return salePrice;
	}

	public double getTodaysPrice() {
		if ((LocalDate.now().compareTo(datePosted.plusDays(90)) < 0)) {
			return salePrice;
		}
		return salePrice * 0.9;
	}

	public void setSalePrice(Integer salePrice) {
		this.salePrice = salePrice;
	}

	public Agent getAgent() {
		return agent;
	}

	public void setAgent(Agent agent) {
		this.agent = agent;
	}

	@Override
	public String toString() {
		return "Property [id=" + id + ", street=" + street + ", city=" + city + ", state=" + state + ", zip=" + zip
				+ ", houseSize=" + houseSize + ", salePrice=" + salePrice + ", agent=" + agent + ", datePosted="
				+ datePosted + "]";
	}

	

	

	

}
