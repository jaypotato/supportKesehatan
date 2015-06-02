package org.supportkesehatan.dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

import org.supportkesehatan.domain.Users;
import org.supportkesehatan.dao.UsersDao;

@Transactional
@Repository("users")
public class HibUsersDao implements UsersDao {
	
	private SessionFactory sessionFactory;

	public HibUsersDao() {
	}

	public SessionFactory getSessionFactory(){
		return sessionFactory;
	}
	
	@Resource(name = "sessionFactory")
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}
	
	public Users findByIdAndPassword(String id, String password) {
		List<Users> users = new ArrayList<Users>();
		users = this.getSessionFactory().getCurrentSession()
				.createQuery("from Users u where u.username = :id and u.password = :password")
				.list();
		if (users.size() > 0) {
			return users.get(0);
		} else {
			return null;
		}
	}
}

