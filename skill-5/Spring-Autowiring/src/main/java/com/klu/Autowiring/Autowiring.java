package com.klu.Autowiring;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class Autowiring {

	    public static void main(String[] args) {
	    	AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(Autoconfig.class);
	    	System.out.println("***Autowiring Demo using Setter DI through App Config & Annotations***");
	        
	 	   user user  =  (user) context.getBean("userbean"); // by bean name
	 	   
	 	   System.out.println("Name:"+user.getName());
	 	   System.out.println("Status:"+user.isStatus());
	 	   System.out.println("hobbies:"+user.getHobbies());
	 	   System.out.println("certifictions:"+user.getCertifications());// this will print user & certification details
	 	   
	 	   Certification certification = (Certification) context.getBean("certification bean");  // by bean name
	 	   
	 	 System.out.println("Certifictions:" +certification.toString());// this will print certification details only
	 	   
	 	   context.close();
	    	
	    }
	}
