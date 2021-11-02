package org.test.vechile.model;

import org.springframework.stereotype.Component;

@Component
public class Vechile {
	
	private Long id;

	private String make;

	private String model;

	private Integer year_model;

	private Double price;

	private Boolean licensed;

	private String date_added;

	

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Integer getYear_model() {
		return year_model;
	}

	public void setYear_model(Integer year_model) {
		this.year_model = year_model;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Boolean getLicensed() {
		return licensed;
	}

	public void setLicensed(Boolean licensed) {
		this.licensed = licensed;
	}

	public String getDate_added() {
		return date_added;
	}

	public void setDate_added(String date_added) {
		this.date_added = date_added;
	}
	
	

}
