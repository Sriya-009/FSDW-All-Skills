package com.klu.Autowiring;

	import java.util.Arrays;
	import org.springframework.context.annotation.Bean;
	import org.springframework.context.annotation.Configuration;
	@Configuration
	public class Autoconfig {
			@Bean(name="userbean")
			public user User() {
				user u=new user();
				u.setId(1);
				u.setName("Ram");
				u.setStatus(true);
				u.setHoobies(Arrays.asList(new String[]{"sleeping","Eating","Playing"}));
				u.setCertifications(certification());
				return u;
				
			}
			@Bean(name="certification bean")
			public Certification certification() {
				Certification c=new Certification();
				c.setCid(22);
				c.setCname("AWS CP");
				c.setCost(8000.00);
				c.setCertificationdate("20/10/2025");
				return c;
				
			}
				
			

		}

