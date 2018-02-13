package fmcg.master.setup.data;

import java.util.Collection;

public class UserTypeMenuMap extends CommonData {
	private String id;
	private String userTypeId;
	private String status;
	private Collection<Menu> menus;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUserTypeId() {
		return userTypeId;
	}
	public void setUserTypeId(String userTypeId) {
		this.userTypeId = userTypeId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Collection<Menu> getMenus() {
		return menus;
	}
	public void setMenus(Collection<Menu> menus) {
		this.menus = menus;
	} 
	

}
