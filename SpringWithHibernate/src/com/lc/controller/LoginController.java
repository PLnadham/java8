package com.lc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lc.entity.LoginEntity;
import com.lc.service.LoginService;

@Controller
public class LoginController {
	@Autowired
	LoginService service;
	@RequestMapping(value="/call",method=RequestMethod.GET)
	public String login(Model model){

		LoginEntity le=new LoginEntity();
		model.addAttribute("le", le);
		
		return "login";
	}
	@RequestMapping(value="/login",method=RequestMethod.POST )
	public String addLogin(@ModelAttribute("le")LoginEntity le,Model model ){
		System.out.println(le);
		service.addLogin(le);
		model.addAttribute("les", le);
		return "success";
	}
	@RequestMapping("/update/{name}")
	public String update(@PathVariable("name")String name,Model model){
		LoginEntity les=service.getLogin(name);
		model.addAttribute("les", les);
		return "updatesuccess";
	}
	
	@RequestMapping("/updatesss")
	public String update2(LoginEntity les ,Model model){
		System.out.println(les);
		service.update(les);
		model.addAttribute("les", les);
		return "success";
	}
	@RequestMapping("/delete/{name}")
	public String delete(@PathVariable("name")String name,Model model){
		service.delete(name);
		LoginEntity le=new LoginEntity();
		model.addAttribute("le", le);
		return "login";
	}
	@RequestMapping("/getAll")
	public String getAll(Model model)
	{
		List l=service.getAll();
		model.addAttribute("list", l);
		return "viewAll";
	}

}
