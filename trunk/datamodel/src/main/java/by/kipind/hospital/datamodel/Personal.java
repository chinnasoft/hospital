package by.kipind.hospital.datamodel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import by.kipind.hospital.datamodel.enam.EProf;

@Entity
public class Personal extends AbstractEntity {

	@Column
	private String firstName;
	@Column
	private Integer tabelNumber;
	@Column
	private String pass;
	@Column
	private Boolean delMarker;
	@Column
	private Boolean conMarker;
	@Column
	@Enumerated(EnumType.ORDINAL)
	private EProf prof;
	@Column
	private String secondName;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public Boolean getDelMarker() {
		return delMarker;
	}

	public void setDelMarker(Boolean delMarker) {
		this.delMarker = delMarker;
	}

	public Boolean getConMarker() {
		return conMarker;
	}

	public void setConMarker(Boolean conMarker) {
		this.conMarker = conMarker;
	}

	public void setProf(EProf prof) {
		this.prof = prof;
	}

	public EProf getProf() {
		return prof;
	}

	public Integer getTabelNumber() {
		return tabelNumber;
	}

	public void setTabelNumber(Integer tabelNumber) {
		this.tabelNumber = tabelNumber;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((super.getId() == null) ? 0 : super.getId().hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Personal other = (Personal) obj;
		if (super.getId() == null) {
			if (other.getId() != null)
				return false;
		} else if (!super.getId().equals(other.getId()))
			return false;
		return true;
	}

}
