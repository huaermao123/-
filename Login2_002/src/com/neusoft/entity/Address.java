package com.neusoft.entity;

public class Address {
/*
 * ��ַ�������ͻ�ѡ��
 */
	private int id ;   
	private String province ;//-- ʡ��
	private String city; //-- ����
	private String area; //- -��/��
	public Address() {
		super();
	}
	public Address(int id, String province, String city, String area) {
		super();
		this.id = id;
		this.province = province;
		this.city = city;
		this.area = area;
	}
	/*
	 * ֱϽ�� ��� ���� �Ϻ� ����
	 */
	public Address(String city, String area) {
		super();
		this.city = city;
		this.area = area;
	}
	@Override
	public String toString() {
		return "Address [id=" + id + ", province=" + province + ", city=" + city + ", area=" + area + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public Address(String province, String city, String area) {
		super();
		this.province = province;
		this.city = city;
		this.area = area;
	}

}