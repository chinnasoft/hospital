package by.kipind.hospital.datamodel;

public class ResultSourse {
	private Long id;
	private Prescribe prescribe;
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
