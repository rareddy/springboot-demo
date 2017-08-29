package io.swagger.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.teiid.spring.annotations.JsonTable;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@JsonTable(endpoint="http://localhost:8090/store/store/inventory", rootIsArray=true)
public class Store {

	@Id
	@Column(name="pet_id")
	@JsonProperty("petId")
	private Long petId;
	
	@JsonProperty("price")
	private Double price;

	public Long getPetId() {
		return petId;
	}

	public void setPetId(Long petId) {
		this.petId = petId;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Store [petId=" + petId + ", price=" + price + "]";
	}
}
