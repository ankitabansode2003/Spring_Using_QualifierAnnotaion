package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.annotaion.ComponenetScan;
import com.beans.People;

public class MainClass {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(ComponenetScan.class);
		People p=context.getBean(People.class);
		System.out.println(p.getSim1().calling());
		System.out.println(p.getSim2().calling());

	}

}
