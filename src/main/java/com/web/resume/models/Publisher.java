package com.web.resume.models;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Publisher {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String name;
	private String addressLine;
	private String city;
	private String state;
	private String zip;
	
	
	@Override
	public String toString() {
		return "Publisher [id=" + id + ", name=" + name + ", addressLine=" + addressLine + ", city=" + city + ", state="
				+ state + ", zip=" + zip + "]";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(addressLine, city, name, state, zip);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Publisher other = (Publisher) obj;
		return Objects.equals(addressLine, other.addressLine) && Objects.equals(city, other.city)
				&& Objects.equals(name, other.name) && Objects.equals(state, other.state)
				&& Objects.equals(zip, other.zip);
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the addressLine
	 */
	public String getAddressLine() {
		return addressLine;
	}
	/**
	 * @param addressLine the addressLine to set
	 */
	public void setAddressLine(String addressLine) {
		this.addressLine = addressLine;
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}
	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}
	/**
	 * @return the zip
	 */
	public String getZip() {
		return zip;
	}
	/**
	 * @param zip the zip to set
	 */
	public void setZip(String zip) {
		this.zip = zip;
	}
	
	
	
}
