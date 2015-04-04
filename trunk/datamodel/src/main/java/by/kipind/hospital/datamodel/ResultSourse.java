package by.kipind.hospital.datamodel;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class ResultSourse {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column 
	private Prescribe prescribe;
	@Column 
	private String sourseLink;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Prescribe getPrescribe() {
		return prescribe;
	}
	public void setPrescribe(Prescribe prescribe) {
		this.prescribe = prescribe;
	}
	public String getSourseLink() {
		return sourseLink;
	}
	public void setSourseLink(String sourseLink) {
		this.sourseLink = sourseLink;
	}
}
