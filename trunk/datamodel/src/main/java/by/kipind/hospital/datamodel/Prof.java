package by.kipind.hospital.datamodel;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Prof {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column 
	private String name;
	@Column 
	private Integer accessLvl;
	
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAccessLvl() {
		return accessLvl;
	}

	public void setAccessLvl(Integer accessLvl) {
		this.accessLvl = accessLvl;
	}

}
