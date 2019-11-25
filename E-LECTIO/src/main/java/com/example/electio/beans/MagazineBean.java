package com.example.electio.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="SPRING_MAGAZINE_TB")

public class MagazineBean {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="MAG_SEQ")
	@SequenceGenerator(sequenceName="SPRING_SEQUENCE_MAGAZINE", allocationSize=1,name="MAG_SEQ")
	private int id;
	private String sname;
	private String sauthor;
	private String spublication;
    public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	private String sdate;
	private int sprice;
	private String scategory;
	private String sstatus;
	private String sdescription;
	private String srating;
	private String simage;
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSauthor() {
		return sauthor;
	}
	public void setSauthor(String sauthor) {
		this.sauthor = sauthor;
	}
	public String getSpublication() {
		return spublication;
	}
	public void setSpublication(String spublication) {
		this.spublication = spublication;
	}
	public String getSdate() {
		return sdate;
	}
	public void setSdate(String sdate) {
		this.sdate = sdate;
	}
	public int getSprice() {
		return sprice;
	}
	public void setSprice(int sprice) {
		this.sprice = sprice;
	}
	public String getScategory() {
		return scategory;
	}
	public void setScategory(String scategory) {
		this.scategory = scategory;
	}
	public String getSstatus() {
		return sstatus;
	}
	public void setSstatus(String sstatus) {
		this.sstatus = sstatus;
	}
	public String getSdescription() {
		return sdescription;
	}
	public void setSdescription(String sdescription) {
		this.sdescription = sdescription;
	}
	public String getSrating() {
		return srating;
	}
	public void setSrating(String srating) {
		this.srating = srating;
	}
	public String getSimage() {
		return simage;
	}
	public void setSimage(String simage) {
		this.simage = simage;
	}

}
