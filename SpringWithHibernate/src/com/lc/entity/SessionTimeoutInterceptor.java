package com.lc.entity;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

//import org.springframework.web.portlet.handler.HandlerInterceptorAdapter;

public class SessionTimeoutInterceptor extends HandlerInterceptorAdapter{
	
	private long firstTime;
	
	/*@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		System.out.println("handler calling");
		if(firstTime==0)
		{
			System.out.println("first request");
			firstTime=System.currentTimeMillis();
		}
		else
		{
			long presentTime=System.currentTimeMillis();
			long diff=presentTime-firstTime;
			if(diff>=180000)
			{
				response.getWriter().write("Session Timeout");
			}
			
			System.out.println("remaining requests"+diff);
		}
		// TODO Auto-generated method stub
		//super.postHandle(request, response, handler, modelAndView);
	}*/
	
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// TODO Auto-generated method stub
		//return super.preHandle(request, response, handler);
		System.out.println("handler calling");
		if(firstTime==0)
		{
			System.out.println("first request");
			firstTime=System.currentTimeMillis();
		}
		else
		{
			long presentTime=System.currentTimeMillis();
			long diff=presentTime-firstTime;
			if(diff>=180000)
			{
				response.getWriter().write("Session Timeout");
				return false;
			}
			else
			{
				firstTime=presentTime;
			}
			
		}
		System.out.println(firstTime);
		return true;
	}
	
}
