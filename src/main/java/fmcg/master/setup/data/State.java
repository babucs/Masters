package fmcg.master.setup.data;

import javax.persistence.OneToOne;

public class State extends CommonData {
	private String stateCode;
	private String stateName;
	@OneToOne
	private Country country;
	private String stateISOCode;
	private String language;
	
	public Country getCountry() {
		return country;
	}
	public void setCountry(Country country) {
		this.country = country;
	}
	public String getStateCode() {
		return stateCode;
	}
	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	
	public String getStateISOCode() {
		return stateISOCode;
	}
	public void setStateISOCode(String stateISOCode) {
		this.stateISOCode = stateISOCode;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}

}
