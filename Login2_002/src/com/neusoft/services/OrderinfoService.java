package com.neusoft.services;

import com.neusoft.dao.DaoException;
import com.neusoft.dao.impl.OrderinfoDaoImpl;

public class OrderinfoService {

	OrderinfoDaoImpl Order= new OrderinfoDaoImpl();
	//����ɾ��
	public int deleteOrd(Integer id) throws DaoException {
		return Order.deleteOrd(id);
	}
	
	
	
	
	
	
}
