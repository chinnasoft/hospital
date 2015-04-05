package by.kipind.hospital.datamodel;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Conferense extends AbstractEntity {
	@Column
	private Date conDateTime;
	@Column
	private String dayOrder;
	@Column
	private Integer conLvl;

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
