package fmcg.master.setup.data;

import javax.persistence.OneToOne;

public class DimensionValues extends CommonData {
	private String dimensionValue;
	private String dimensionValueCode;
	private String dimensionFor;
	private String status;
	@OneToOne
	private Dimension dimension;
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getDimensionValue() {
		return dimensionValue;
	}
	public void setDimensionValue(String dimensionValue) {
		this.dimensionValue = dimensionValue;
	}
	public String getDimensionValueCode() {
		return dimensionValueCode;
	}
	public void setDimensionValueCode(String dimensionValueCode) {
		this.dimensionValueCode = dimensionValueCode;
	}
	public String getDimensionFor() {
		return dimensionFor;
	}
	public void setDimensionFor(String dimensionFor) {
		this.dimensionFor = dimensionFor;
	}
	public Dimension getDimension() {
		return dimension;
	}
	public void setDimension(Dimension dimension) {
		this.dimension = dimension;
	}
	
}
