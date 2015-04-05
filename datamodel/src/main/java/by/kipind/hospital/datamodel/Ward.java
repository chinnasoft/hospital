package by.kipind.hospital.datamodel;

import javax.persistence.Column;
import javax.persistence.Entity;


@Entity
public class Ward extends AbstractEntity{
	
	@Column
	private Integer wardNum;
	@Column
	private Integer comfortLvl;
	
	
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

}
