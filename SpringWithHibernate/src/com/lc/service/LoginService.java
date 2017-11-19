package com.lc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lc.dao.LoginDao;
import com.lc.entity.LoginEntity;

@Service
public class LoginService {
	@Autowired
	LoginDao dao;
	
	public void addLogin(LoginEntity le){
		dao.addLogin(le);
	}
	public void update(LoginEntity name){
		dao.update(name);
	}
	
	public LoginEntity getLogin(String name)
	{
		return dao.getLogin(name);
	}
	public void delete(String name){
		dao.delete(name);
	}
	
	public List getAll()
	{
		return dao.getAll();
	}
}
