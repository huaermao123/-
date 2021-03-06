package com.neusoft.dao;

import java.util.List;


import com.neusoft.entity.Consumer;
import com.neusoft.entity.PageModel;

public interface ConsumerDao {

	
	
	/*
	 * 修改id 用户名与密码
	 */
	
	public int updateConsumerAll(Consumer ucon) throws DaoException ;
	  /**
	   * 添加
	   */
		public int insertConsumer(ConsumerDao  con)throws DaoException;
		
		/**
		 * 删除id
		 */
		public int deleteConsumer(Integer id)throws DaoException;
		
		
		/**
		 * 修改  
		 */
		public int updateConsumer(ConsumerDao ucon)throws DaoException;

		
		//修改用户名的
		public int updateLoginname(String loginname,int id)throws DaoException;
		
		
		/**
		 * 查询所有的
		 */
		public List<Consumer> getConsumerList()throws DaoException;
		
		
		/**
		 * 分页查询
		 * @param pageNo    页数
		 * @param pageSize  每页显示数据的条数
		 * */
		public PageModel<Consumer>  getCatesByPage(int pageNo,int pageSize);	
		
}
