package by.kipind.hospital.datamodel;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Product extends AbstractEntity {

	@Column
	private String name;
	@Column
	private BigDecimal basePrice;
	@Column
	private Boolean available;

	

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getBasePrice() {
		return basePrice;
	}

	public void setBasePrice(BigDecimal basePrice) {
		this.basePrice = basePrice;
	}

	public Boolean getAvailable() {
		return available;
	}

	public void setAvailable(Boolean available) {
		this.available = available;
	}

	@Override
	public String toString() {
		return "Product [id=" + getId() + ", name=" + name + ", basePrice=" + basePrice + ", available=" + available + "]";
	}

}
