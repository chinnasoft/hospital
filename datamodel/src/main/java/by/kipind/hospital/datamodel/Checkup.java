package by.kipind.hospital.datamodel;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;

@Entity
public class Checkup extends AbstractEntity {

	@ManyToOne(fetch = FetchType.LAZY, targetEntity = Personal.class)
	private Personal personal;

	@ManyToOne(fetch = FetchType.LAZY, targetEntity = Visit.class)
	private Visit visit;
	@Column
	private Date chDt;
	@Column
	private String interview;
	@Column
	private String diagnosis;

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
