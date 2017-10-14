package com.neusoft.dao;

import java.util.List;


import com.neusoft.entity.Consumer;
import com.neusoft.entity.PageModel;

public interface ConsumerDao {

	
	
	/*
	 * �޸�id �û���������
	 */
	
	public int updateConsumerAll(Consumer ucon) throws DaoException ;
	  /**
	   * ����
	   */
		public int insertConsumer(ConsumerDao  con)throws DaoException;
		
		/**
		 * ɾ��id
		 */
		public int deleteConsumer(Integer id)throws DaoException;
		
		
		/**
		 * �޸�  
		 */
		public int updateConsumer(ConsumerDao ucon)throws DaoException;

		
		//�޸��û�����
		public int updateLoginname(String loginname,int id)throws DaoException;
		
		
		/**
		 * ��ѯ���е�
		 */
		public List<Consumer> getConsumerList()throws DaoException;
		
		
		/**
		 * ��ҳ��ѯ
		 * @param pageNo    ҳ��
		 * @param pageSize  ÿҳ��ʾ���ݵ�����
		 * */
		public PageModel<Consumer>  getCatesByPage(int pageNo,int pageSize);	
		
}