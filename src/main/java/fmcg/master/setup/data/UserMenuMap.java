package fmcg.master.setup.data;

import java.util.Collection;

public class UserMenuMap extends CommonData {
	private String id;
	private String userId;
	private String status;
	private Collection<Menu> menus;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
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
