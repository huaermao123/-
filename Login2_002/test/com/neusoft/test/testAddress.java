package com.neusoft.test;

import java.util.List;

import com.neusoft.dao.impl.AddressDaoImpl;

import com.neusoft.entity.Address;
import com.neusoft.entity.PageModel;


public class testAddress {
	public static void main(String[] args) {
		add();
		//del();
		//xg();
		//addAll();
		//getxy();
	}
	//����
	public static void add() {
		Address addr=new Address("������","������","��ɽ��");
		int o=new AddressDaoImpl().insertAddr(addr);
		System.out.println(o);
	}
	//ɾ��
	public static void del() {
		int p=new AddressDaoImpl().deleteAddr(2);
		System.out.println(p);
	}
	//�޸�
	public static void xg() {
		Address addr=new Address(3,"������","������","������");
		System.out.println(addr);
		int d=new AddressDaoImpl().updateAddr(addr);
		System.out.println(d);
	}
	//��ѯ
	public static void addAll() {
		List<Address> d=new AddressDaoImpl().getOrderinfoList();
		System.out.println(d);
	}
	 //��ѯ��ҳ
	 public static void  getxy() {
		 PageModel<Address> cd= new AddressDaoImpl().getAddrByPage(1, 2);
		 System.out.println(cd);
	 }
	
}