package by.kipind.hospital.datamodel;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Prescribe {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column 
	private Checkup checkup;
	@Column 
	private String coment;
	@Column 
	private String resValue;
	@Column 
	private Date resDt;
	@Column 
	private Personal resPersonal;
	
	private List<ResultSourse> resSourseList;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Checkup getCheckup() {
		return checkup;
	}
	public void setCheckup(Checkup checkup) {
		this.checkup = checkup;
	}
	public String getComent() {
		return coment;
	}
	public void setComent(String coment) {
		this.coment = coment;
	}
	public String getResValue() {
		return resValue;
	}
	public void setResValue(String resValue) {
		this.resValue = resValue;
	}
	public Date getResDt() {
		return resDt;
	}
	public void setResDt(Date resDt) {
		this.resDt = resDt;
	}
	public Personal getResPersonal() {
		return resPersonal;
	}
	public void setResPersonal(Personal resPersonal) {
		this.resPersonal = resPersonal;
	}
	public List<ResultSourse> getResSourseList() {
		return resSourseList;
	}
	public void setResSourseList(List<ResultSourse> resSourseList) {
		this.resSourseList = resSourseList;
	}
	
}
