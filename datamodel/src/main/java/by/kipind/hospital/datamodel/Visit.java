package by.kipind.hospital.datamodel;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;

import by.kipind.hospital.datamodel.enam.EDischargeStatus;

@Entity
public class Visit extends AbstractEntity {

	@ManyToOne(fetch = FetchType.LAZY, targetEntity = Ward.class)
	private Ward ward;
	@ManyToOne(fetch = FetchType.LAZY, targetEntity = Patient.class)
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
	@Enumerated(EnumType.ORDINAL)
	private EDischargeStatus dischargeFlag; // статус пациента по выписке

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

	public EDischargeStatus getDischargeFlag() {
		return dischargeFlag;
	}

	public void setDischargeFlag(EDischargeStatus dischargeFlag) {
		this.dischargeFlag = dischargeFlag;
	}

}
