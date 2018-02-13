package fmcg.master.setup.data;

import java.util.Date;

public class HeadQuarter extends CommonData {
	private String hqCode;
	private String hqName;
	private Date startDate;
	private Date endDate;
	private String addreessId;
	public String getHqCode() {
		return hqCode;
	}
	public void setHqCode(String hqCode) {
		this.hqCode = hqCode;
	}
	public String getHqName() {
		return hqName;
	}
	public void setHqName(String hqName) {
		this.hqName = hqName;
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
	public String getAddreessId() {
		return addreessId;
	}
	public void setAddreessId(String addreessId) {
		this.addreessId = addreessId;
	}
	
	
}
