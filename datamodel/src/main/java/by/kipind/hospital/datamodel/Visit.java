package by.kipind.hospital.datamodel;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Visit {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column 
	private Ward ward;
	@Column 
	private Patient patient;
	@Column 
	private Date startDt;
	@Column 
	private Date endDt;
	@Column 
	private String firstDs;
	@Column 
	private String lastDs;
	@Column 
	private Integer importantFlag;
	@Column 
	private Integer dischargeFlag; //выписка
	
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
	public Ward getWard() {
		return ward;
	}
	public void setWard(Ward ward) {
		this.ward = ward;
	}
	public Date getStartDt() {
		return startDt;
	}
	public void setStartDt(Date startDt) {
		this.startDt = startDt;
	}

}
