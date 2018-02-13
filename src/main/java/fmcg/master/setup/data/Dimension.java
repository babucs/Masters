package fmcg.master.setup.data;

public class Dimension extends CommonData {
	private String dimensionFor;
	private String dimensionType;
	private String dimesionMode;
	private String status;
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getDimensionFor() {
		return dimensionFor;
	}
	public void setDimensionFor(String dimensionFor) {
		this.dimensionFor = dimensionFor;
	}
	public String getDimensionType() {
		return dimensionType;
	}
	public void setDimensionType(String dimensionType) {
		this.dimensionType = dimensionType;
	}
	public String getDimesionMode() {
		return dimesionMode;
	}
	public void setDimesionMode(String dimesionMode) {
		this.dimesionMode = dimesionMode;
	}
	

}
