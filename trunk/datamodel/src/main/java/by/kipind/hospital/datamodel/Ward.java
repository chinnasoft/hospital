package by.kipind.hospital.datamodel;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Ward extends AbstractEntity {

	@Column
	private Integer wardNum;
	@Column
	private Integer comfortLvl;
	@JoinTable(name = "ward_2_personal", joinColumns = { @JoinColumn(name = "ward_id") }, inverseJoinColumns = { @JoinColumn(name = "personal_id") })
	@ManyToMany(targetEntity = Personal.class, fetch = FetchType.LAZY)
	private Set<Personal> personal;

	public Integer getWardNum() {
		return wardNum;
	}

	public void setWardNum(Integer wardNum) {
		this.wardNum = wardNum;
	}

	public Integer getComfortLvl() {
		return comfortLvl;
	}

	public void setComfortLvl(Integer comfortLvl) {
		this.comfortLvl = comfortLvl;
	}

	public Set<Personal> getPersonal() {
		return personal;
	}

	public void setPersonal(Set<Personal> personal) {
		this.personal = personal;
	}

}
