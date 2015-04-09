package by.kipind.hospital.datamodel;

import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Prescribe extends AbstractEntity {

	@ManyToOne(fetch = FetchType.LAZY, targetEntity = Checkup.class)
	private Checkup checkup;
	@Column
	private String coment;
	@Column
	private String resValue;
	@Column
	private Date resDt;
	@ManyToOne(fetch = FetchType.LAZY, targetEntity = Personal.class)
	private Personal resPersonal;
	@OneToMany(fetch = FetchType.LAZY, targetEntity = ResultSource.class)
	private Set<ResultSource> resSourseList;

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

	public Set<ResultSource> getResSourseList() {
		return resSourseList;
	}

	public void setResSourseList(Set<ResultSource> resSourseList) {
		this.resSourseList = resSourseList;
	}

}
