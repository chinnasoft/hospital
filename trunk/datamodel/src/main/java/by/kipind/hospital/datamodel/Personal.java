package by.kipind.hospital.datamodel;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Personal {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column
	private String firstName;
	@Column
	private String secondName;
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
	private Prof prof;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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

	public void setProf(Prof prof) {
		this.prof = prof;
	}

	public Prof getProf() {
		return prof;
	}

	public Integer getTabelNumber() {
		return tabelNumber;
	}

	public void setTabelNumber(Integer tabelNumber) {
		this.tabelNumber = tabelNumber;
	}

}
