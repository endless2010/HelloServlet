package com.mycompany.filters;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

@WebFilter(filterName="log",urlPatterns={"/*"})
public class LogFilter implements Filter{
	@Override
	public void doFilter(ServletRequest request,
			ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("--start filter---");
		long start=System.currentTimeMillis();
		HttpServletRequest httpRequest=(HttpServletRequest)request;
		System.out.println("queryString:"+httpRequest.getQueryString());
		System.out.println("requestURI:"+httpRequest.getRequestURI());
		
		chain.doFilter(request, response);
		System.out.println("----end filter---");
		long end=System.currentTimeMillis();
		System.out.println("millis:"+(end-start));
	}
	
	@Override
	public void destroy() {
	}



	@Override
	public void init(FilterConfig filterconfig) throws ServletException {
	}

}
