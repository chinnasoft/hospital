package by.kipind.hospital.datamodel;

public class Personal {

	private Long id;
	private String firstName;
	private String secondName;
	private Integer tabNumber;
	private String pass;
	private Prof prof;
	private Boolean delMarker;
	private Boolean conMarker;

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

	public Integer getTabNumber() {
		return tabNumber;
	}

	public void setTabNumber(Integer tabNumber) {
		this.tabNumber = tabNumber;
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

}
