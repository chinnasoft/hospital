package by.kipind.hospital.datamodel;

import java.util.Date;

public class Visit {
	private Long id;
	private Patient patient;
	private Date start_dt;
	private Date endDt;
	private String firstDs;
	private String lastDs;
	private Integer carentWard;
	private Integer importantFlag;
	private Integer dischargeFlag;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Patient getPatient() {
		return patient;
	}
	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	public Date getStart_dt() {
		return start_dt;
	}
	public void setStart_dt(Date start_dt) {
		this.start_dt = start_dt;
	}
	public Date getEndDt() {
		return endDt;
	}
	public void setEndDt(Date endDt) {
		this.endDt = endDt;
	}
	public String getFirstDs() {
		return firstDs;
	}
	public void setFirstDs(String firstDs) {
		this.firstDs = firstDs;
	}
	public String getLastDs() {
		return lastDs;
	}
	public void setLastDs(String lastDs) {
		this.lastDs = lastDs;
	}
	public Integer getCarentWard() {
		return carentWard;
	}
	public void setCarentWard(Integer carentWard) {
		this.carentWard = carentWard;
	}
	public Integer getImportantFlag() {
		return importantFlag;
	}
	public void setImportantFlag(Integer importantFlag) {
		this.importantFlag = importantFlag;
	}
	public Integer getDischargeFlag() {
		return dischargeFlag;
	}
	public void setDischargeFlag(Integer dischargeFlag) {
		this.dischargeFlag = dischargeFlag;
	}

}
