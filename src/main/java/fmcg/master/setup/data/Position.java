package fmcg.master.setup.data;

import java.util.Collection;
import java.util.Date;

import javax.persistence.OneToMany;

public class Position extends CommonData{
	private String positionCode;
	private String positionName;
	private Date startDate;
	private Date endDate;
	@OneToMany
	private Collection<Division> division;
	@OneToMany
	private Collection<Role> role;
	@OneToMany
	private Collection<HeadQuarter> headQuarter;
	public String getPositionCode() {
		return positionCode;
	}
	public void setPositionCode(String positionCode) {
		this.positionCode = positionCode;
	}
	public String getPositionName() {
		return positionName;
	}
	public void setPositionName(String positionName) {
		this.positionName = positionName;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public Collection<Division> getDivision() {
		return division;
	}
	public void setDivision(Collection<Division> division) {
		this.division = division;
	}
	public Collection<Role> getRole() {
		return role;
	}
	public void setRole(Collection<Role> role) {
		this.role = role;
	}
	public Collection<HeadQuarter> getHeadQuarter() {
		return headQuarter;
	}
	public void setHeadQuarter(Collection<HeadQuarter> headQuarter) {
		this.headQuarter = headQuarter;
	}
	

}
