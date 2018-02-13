package fmcg.master.setup.data;

import java.util.Date;


public class PositionParentPositionMap extends CommonData {
	private String parentpositioncode;
	private Date startdate;
	private Date enddate;
	private String id;
	private String position;
	public String getParentpositioncode() {
		return parentpositioncode;
	}
	public void setParentpositioncode(String parentpositioncode) {
		this.parentpositioncode = parentpositioncode;
	}
	public Date getStartdate() {
		return startdate;
	}
	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}
	public Date getEnddate() {
		return enddate;
	}
	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	

}
