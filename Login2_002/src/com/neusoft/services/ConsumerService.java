package com.neusoft.services;

import com.neusoft.dao.DaoException;
import com.neusoft.dao.impl.ConsumerDaoImpl;
import com.neusoft.entity.Consumer;

public class ConsumerService {

	ConsumerDaoImpl cons=new ConsumerDaoImpl();
	//ɾ��
	public int deleteConsumer(Integer id) throws DaoException {
	    return cons.deleteConsumer(id);
	}
	//���ӻ�Ա
	public int insertConsumer(Consumer con) throws DaoException {
		return cons.insertConsumer(con);
	}
	//�޸Ļ�Ա���뼰��
	public int updateConsumerAll(Consumer ucon) throws DaoException {
		return cons.updateConsumerAll(ucon);
	}
		
}