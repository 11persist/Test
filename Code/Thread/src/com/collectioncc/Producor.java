package com.collectioncc;

public class Producor{

	private Integer number;
	private String producor;
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	public String getProducor() {
		return producor;
	}
	public void setProducor(String producor) {
		this.producor = producor;
	}
	public Producor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Producor(Integer number, String producor) {
		super();
		this.number = number;
		this.producor = producor;
	}
	
}
