package by.kipind.hospital.datamodel;

import java.util.Date;

public class Conferense {
	private Long id;
	private Date conDateTime;
	private String dayOrder;
	private Integer conLvl;
	private Integer conLvlType;
	
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
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
	public Integer getConLvlType() {
		return conLvlType;
	}
	public void setConLvlType(Integer conLvlType) {
		this.conLvlType = conLvlType;
	}
}
