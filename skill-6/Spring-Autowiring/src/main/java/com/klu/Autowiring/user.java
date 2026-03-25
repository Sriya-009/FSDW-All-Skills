package com.klu.Autowiring;


	import java.util.List;

	import org.springframework.beans.factory.annotation.Autowired;

	public class user {
	      private int id;
	      private String name;
	      private boolean status;
	      private List<String> hobbies;
	      @Autowired
	      private Certification certifications;
		  public int getId() {
			  return id;
		  }
		  public void setId(int id) {
			  this.id = id;
		  }
		  public String getName() {
			  return name;
		  }
		  public void setName(String name) {
			  this.name = name;
		  }
		  public boolean isStatus() {
			  return status;
		  }
		  public void setStatus(boolean status) {
			  this.status = status;
		  }
		  public List<String> getHobbies() {
			  return hobbies;
		  }
		  public void setHoobies(List<String> hobbies) {
			  this.hobbies = hobbies;
		  }
		  public Certification getCertifications() {
			  return certifications;
		  }
		  public void setCertifications(Certification certifications) {
			  this.certifications = certifications;
		  }
		  @Override
		  public String toString() {
			return "User [id=" + id + ", name=" + name + ", status=" + status + ", hobbies=" + hobbies + ", certifications="
					+ certifications + "]";
		  }
		 
	}



