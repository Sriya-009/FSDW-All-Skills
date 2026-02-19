package com.klu.Autowiring;


	public class Certification {
	   private long cid;
	   private String cname;
	   private double cost;
	   private String certificationdate;//date of completion
	   public long getCid() {
		return cid;
	   }
	   public void setCid(long cid) {
		this.cid = cid;
	   }
	   public String getCname() {
		return cname;
	   }
	   public void setCname(String cname) {
		this.cname = cname;
	   }
	   public double getCost() {
		return cost;
	   }
	   public void setCost(double cost) {
		this.cost = cost;
	   }
	   public String getCertificationdate() {
		return certificationdate;
	   }
	   public void setCertificationdate(String certificationdate) {
		this.certificationdate = certificationdate;
	   }
	   @Override
	   public String toString() {
		return "Certification [cid=" + cid + ", cname=" + cname + ", cost=" + cost + ", certificationdate="
				+ certificationdate + "]";
	   }
	   
	}



