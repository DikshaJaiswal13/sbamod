package com.example.mentorOnDemand.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "technology")
public class Technology {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
//link to MentorSkill.java
    
    
 //unique courses must have unique mid and folowing all the entity
   
    @Column(name = "technology_name")
    private String technologyName ;
    
	/*
	 * @Column(name = "toc") private String toc ;
	 */
    
    @Column(name = "fees")
    private Double fees ;
    
   
    @Column(name = "duration")
    private Double duration ;
    
   
	/*
	 * @Column(name = "prerequites") private String prerequites ;
	 */


	public String getTechnologyName() {
		return technologyName;
	}


	public void setTechnologyName(String technologyName) {
		this.technologyName = technologyName;
	}

	/*
	 * public String getToc() { return toc; }
	 * 
	 * 
	 * public void setToc(String toc) { this.toc = toc; }
	 */

	public Double getFees() {
		return fees;
	}


	public void setFees(Double fees) {
		this.fees = fees;
	}


	public Double getDuration() {
		return duration;
	}


	public void setDuration(Double duration) {
		this.duration = duration;
	}


	/*
	 * public String getPrerequites() { return prerequites; }
	 * 
	 * 
	 * public void setPrerequites(String prerequites) { this.prerequites =
	 * prerequites; }
	 */

	public Technology(int id, String technology_name, Double fees, Double duration) {
		super();
		this.id = id;
		this.technologyName = technologyName;
		//this.toc = toc;
		this.fees = fees;
		this.duration = duration;
		//this.prerequites = prerequites;
	}


	@Override
	public String toString() {
		return "Technology [id=" + id + ", technologyName=" + technologyName + ", fees=" + fees + ", duration="
				+ duration + "]";
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public Technology() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    
 
}
