package com.reyesmagos.bancoldex.bancoldexapp.modelo;

import java.util.List;

abstract class BusinessManUser {
	
	private String username;
	private String password;
	private String nit;
	private String sector;
	private String subSector;
	private List<String> partners;
	private Location location;
	private String enterpriseType;
	
	public String getEnterpriseType() {
		return enterpriseType;
	}
	public void setEnterpriseType(String enterpriseType) {
		this.enterpriseType = enterpriseType;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNit() {
		return nit;
	}
	public void setNit(String nit) {
		this.nit = nit;
	}
	public String getSector() {
		return sector;
	}
	public void setSector(String sector) {
		this.sector = sector;
	}
	public String getSubSectro() {
		return subSector;
	}
	public void setSubSectro(String subSectro) {
		this.subSector = subSectro;
	}
	public List<String> getPartners() {
		return partners;
	}
	public void setPartners(List<String> partners) {
		this.partners = partners;
	}
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	
	
	

}
