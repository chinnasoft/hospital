package by.kipind.hospital.datamodel;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Conferense {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column 
	private Date conDateTime;
	@Column 
	private String dayOrder;
	@Column 
	private Integer conLvl;
	
	
	
	
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
	
}
