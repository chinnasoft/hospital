package by.kipind.hospital.datamodel;

import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Conferense extends AbstractEntity {

	@Column
	private Date conDateTime;
	@Column
	private String dayOrder;
	@Column
	private Integer conLvl;

	@JoinTable(name = "conference_2_visit", joinColumns = { @JoinColumn(name = "conferene_id") }, inverseJoinColumns = { @JoinColumn(name = "visit_id") })
	@ManyToMany(targetEntity = Visit.class, fetch = FetchType.LAZY)
	private Set<Visit> visits;

	@JoinTable(name = "conference_2_personal", joinColumns = { @JoinColumn(name = "conferense_id") }, inverseJoinColumns = { @JoinColumn(name = "personal_id") })
	@ManyToMany(targetEntity = Personal.class, fetch = FetchType.LAZY)
	private Set<Personal> personal;

	public Date getConDateTime() {
		return conDateTime;
	}

	public void setConDateTime(Date conDateTime) {
		this.conDateTime = conDateTime;
	}

	public String getDayOrder() {
		return dayOrder;
	}

	public void setDayOrder(String dayOrder) {
		this.dayOrder = dayOrder;
	}

	public Integer getConLvl() {
		return conLvl;
	}

	public void setConLvl(Integer conLvl) {
		this.conLvl = conLvl;
	}

	public Set<Visit> getVisits() {
		return visits;
	}

	public void setVisits(Set<Visit> visits) {
		this.visits = visits;
	}

	public Set<Personal> getPersonal() {
		return personal;
	}

	public void setPersonal(Set<Personal> personal) {
		this.personal = personal;
	}

}
