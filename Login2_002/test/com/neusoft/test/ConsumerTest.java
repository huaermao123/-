package com.neusoft.test;

import java.util.List;

import com.neusoft.dao.DaoFactory;
import com.neusoft.dao.impl.ConsumerDaoImpl;
import com.neusoft.entity.Consumer;
import com.neusoft.entity.PageModel;

public class ConsumerTest {
//会员======================================================================
	public static void main(String[] args) {
		//insert();
	     All();
	    // de();
	    //fy(); 
	     //gai();
	     //name();
		AllNamePsw();
	}
	//添加
	public static void insert() {
		for(int i=0;i<10;i++) {
			Consumer con=new Consumer("dfkjd+i", "fdkfh+i+ioo");
			int cc=new ConsumerDaoImpl().insertConsumer(con);
			 System.out.println(cc);
		}
		}
		
	 /**
	    * 查询所有的
	    */
	  
		
		public static void All() {
			
			 List<Consumer> ddd= new ConsumerDaoImpl().getConsumerList();
			  System.out.println(ddd);
			
	   }
		/**
		 * 删除id
		 */
		public static void de() {
			int t=new ConsumerDaoImpl().deleteConsumer(3);
			System.out.println(t);
		}
/*
 * 分页
 */
   public static void fy() {
	   PageModel<Consumer> t=new ConsumerDaoImpl().getCatesByPage(1, 2);
		System.out.println(t);
  }
   
   //修改 根据id
   public static void gai() {
	   Consumer ucon=new Consumer(3,"admin");
	int cc=	new ConsumerDaoImpl().updateConsumer(ucon);
		System.out.println(cc);
	}
	/*
	 * 改用户名
	 *
	 */

public static void name() {
	int d=new ConsumerDaoImpl().updateLoginname("李华栋", 2);
	System.out.println(d);
}
/*
 * 改用户名与密码
 *
 */
public static void AllNamePsw() {
	  Consumer ucon=new Consumer(12,"李华栋","李华栋");
	int d=new ConsumerDaoImpl().updateConsumerAll(ucon);
	System.out.println(d);
}
  
}
