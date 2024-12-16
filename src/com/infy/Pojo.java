package com.infy;

public class Pojo {
	
	private  Integer idInteger;
	private String nameString;
	
	
	public Pojo(Integer idInteger, String nameString) {
		super();
		this.idInteger = idInteger;
		this.nameString = nameString;
	}
	public Integer getIdInteger() {
		return idInteger;
	}
	public void setIdInteger(Integer idInteger) {
		this.idInteger = idInteger;
	}
	public String getNameString() {
		return nameString;
	}
	public void setNameString(String nameString) {
		this.nameString = nameString;
	}
	@Override
	public String toString() {
		return "Pojo [idInteger=" + idInteger + ", nameString=" + nameString + "]";
	}

	
	
}
