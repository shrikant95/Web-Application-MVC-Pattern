package com.javawebtutor.service;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.javawebtutor.hibernate.util.HibernateUtil;
import com.javawebtutor.model.User;

public class UpdateRecordService {
	

	

	public int result;

	public boolean updateRecord(User user)
	{
		try
		{
			Session session=HibernateUtil.openSession();
			Transaction tx=null;
			
			tx=session.beginTransaction();
			Query query=session.createQuery("update user set firstName= '"+user.getFirstName()+"', middleName='"+user.getMiddleName()+"', lastName='"+user.getLastName()+"',email='"+user.getEmail()+"', mobile='"+user.getMobile()+"',password='"+user.getPassword()+"' where id='"+user.getId()+"' ");
	       result = query.executeUpdate();
	        tx.commit();
	        session.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return false;
	}
}
