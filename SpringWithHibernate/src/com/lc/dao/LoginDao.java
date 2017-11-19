package com.lc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.lc.entity.LoginEntity;

@Repository
public class LoginDao {
	@Autowired
	HibernateTemplate templet;
	public void addLogin(LoginEntity le){
		templet.save(le);
	}
	
	public void update(LoginEntity le1){
	
		templet.update(le1);
	}
	
	
	public LoginEntity getLogin(String name)
	{
		LoginEntity le=	templet.get(LoginEntity.class, name);
		return le;
		//jhjhkkjdfkdsjbckmnbjk
	}
	
	public void delete(String name){
	LoginEntity le=	getLogin(name);
		templet.delete(le);
	}
	
	
	public List getAll()
	{
		String sql="FROM LoginEntity";
		List<LoginEntity> l=templet.find(sql);
		System.out.println(l);
		return l;
	}
}
