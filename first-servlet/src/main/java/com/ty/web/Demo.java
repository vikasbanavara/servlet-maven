package com.ty.web;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Demo extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("hi i am a service method in demo servelet class");
	}

}

//Deploy the Servlet (in web.xml)
//Mapping to to the Servlet (in web.xml)