package by.kipind.hospital.datamodel;

import java.util.Date;

public class Checkup {
	private Long id;
	private Personal personal;
	private Visit visit;
	private Date chDt;
	private String interview;
	private String diagnosis;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Personal getPersonal() {
		return personal;
	}
	public void setPersonal(Personal personal) {
		this.personal = personal;
	}
	public Visit getVisit() {
		return visit;
	}
	public void setVisit(Visit visit) {
		this.visit = visit;
	}
	public Date getChDt() {
		return chDt;
	}
	public void setChDt(Date chDt) {
		this.chDt = chDt;
	}
	public String getInterview() {
		return interview;
	}
	public void setInterview(String interview) {
		this.interview = interview;
	}
	public String getDiagnosis() {
		return diagnosis;
	}
	public void setDiagnosis(String diagnosis) {
		this.diagnosis = diagnosis;
	}
}
