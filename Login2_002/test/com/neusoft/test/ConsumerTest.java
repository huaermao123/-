package com.neusoft.test;

import java.util.List;

import com.neusoft.dao.DaoFactory;
import com.neusoft.dao.impl.ConsumerDaoImpl;
import com.neusoft.entity.Consumer;
import com.neusoft.entity.PageModel;

public class ConsumerTest {
//��Ա======================================================================
	public static void main(String[] args) {
		//insert();
	     All();
	    // de();
	    //fy(); 
	     //gai();
	     //name();
		AllNamePsw();
	}
	//����
	public static void insert() {
		for(int i=0;i<10;i++) {
			Consumer con=new Consumer("dfkjd+i", "fdkfh+i+ioo");
			int cc=new ConsumerDaoImpl().insertConsumer(con);
			 System.out.println(cc);
		}
		}
		
	 /**
	    * ��ѯ���е�
	    */
	  
		
		public static void All() {
			
			 List<Consumer> ddd= new ConsumerDaoImpl().getConsumerList();
			  System.out.println(ddd);
			
	   }
		/**
		 * ɾ��id
		 */
		public static void de() {
			int t=new ConsumerDaoImpl().deleteConsumer(3);
			System.out.println(t);
		}
/*
 * ��ҳ
 */
   public static void fy() {
	   PageModel<Consumer> t=new ConsumerDaoImpl().getCatesByPage(1, 2);
		System.out.println(t);
  }
   
   //�޸� ����id
   public static void gai() {
	   Consumer ucon=new Consumer(3,"admin");
	int cc=	new ConsumerDaoImpl().updateConsumer(ucon);
		System.out.println(cc);
	}
	/*
	 * ���û���
	 *
	 */

public static void name() {
	int d=new ConsumerDaoImpl().updateLoginname("���", 2);
	System.out.println(d);
}
/*
 * ���û���������
 *
 */
public static void AllNamePsw() {
	  Consumer ucon=new Consumer(12,"���","���");
	int d=new ConsumerDaoImpl().updateConsumerAll(ucon);
	System.out.println(d);
}
  
}