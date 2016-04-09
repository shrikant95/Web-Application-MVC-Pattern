package com.javawebtutor.service;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.javawebtutor.hibernate.util.HibernateUtil;
import com.javawebtutor.model.User;

public class LoginService {

    public boolean authenticateUser(String eamilOrMobile, String password) {
        User user = getUser(eamilOrMobile);          
        if(user!=null && user.getPassword().equals(password)){
            return true;
        }else{ 
            return false;
        }
    }

    public User getUser(String eamilOrMobile) {
        Session session = HibernateUtil.openSession();
        Transaction tx = null;
        User user = null;
        StringBuffer qry=new StringBuffer("from User where ");
        if(eamilOrMobile.contains("@")){
        	qry.append("email='").append(eamilOrMobile).append("'");
        }
        else{
        	qry.append("mobile='").append(eamilOrMobile).append("'");
        }
        try {
            tx = session.getTransaction();
            tx.begin();
            Query query = session.createQuery(qry.toString());
            user = (User)query.uniqueResult();
            tx.commit();
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
        return user;
    }
    
    @SuppressWarnings("unchecked")
	public List<User> getListOfUsers(){
        List<User> list = new ArrayList<User>();
        Session session = HibernateUtil.openSession();
        Transaction tx = null;        
        try {
            tx = session.getTransaction();
            tx.begin();
            list = session.createQuery("from User").list();                        
            tx.commit();
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
        return list;
    }
}
