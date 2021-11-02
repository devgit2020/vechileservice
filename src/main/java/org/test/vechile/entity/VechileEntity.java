package org.test.vechile.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.garage.car.democar.entity.CarEntity;
import org.test.vechile.model.Vechile;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Santosh Behera
 *
 */
@Getter
@Setter
@Entity
@Table(name="Vechile")
public class VechileEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String make;

	private String model;

	private Integer year_model;

	private Double price;

	private Boolean licensed;

	private String date_added;
	
	public static VechileEntity toVechileEntity(Vechile vechile) {
		VechileEntity entity = new VechileEntity();
		entity.setMake(vechile.getMake());
		entity.setModel(vechile.getModel());
		entity.setYear_model(vechile.getYear_model());
		entity.setLicensed(vechile.getLicensed());
		entity.setDate_added(vechile.getDate_added());
		
		return entity;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
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

	public void setModel(String model) {
		this.model = model;
	}

	public String getModel() {
		return model;
	}

	public String getDate_added() {
		return date_added;
	}

	public void setDate_added(String date_added) {
		this.date_added = date_added;
	}

}
