package com.mycompany.listeners;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@WebListener
public class MySessionListener implements HttpSessionListener,HttpSessionAttributeListener{

	@Override
	public void attributeAdded(HttpSessionBindingEvent event) {
		System.out.println("--session: "+event.getSession().getId()+
				" attribute,name="+event.getName()+",value="+event.getValue()+ " created--");
	}

	@Override
	public void attributeRemoved(HttpSessionBindingEvent event) {
		System.out.println("--session: "+event.getSession().getId()+
				" attribute,name="+event.getName()+",value="+event.getValue()+ " removed--");
	}

	@Override
	public void attributeReplaced(
			HttpSessionBindingEvent event) {
		System.out.println("--session: "+event.getSession().getId()+
				" attribute,name="+event.getName()+",value="+event.getValue()+ " replaced--");	
	}

	@Override
	public void sessionCreated(HttpSessionEvent event) {
		System.out.println("--session: "+event.getSession().getId()+ " created--");
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent event) {
		System.out.println("--session: "+event.getSession().getId()+ " destroyed--");	
	}

}
