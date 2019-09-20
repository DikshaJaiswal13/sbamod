package com.example.mentorOnDemand.model;

import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mentorskill")
public class MentorSkill {
	
	  @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int id;
	//link to Mentor.java
	    
		/*
		 * @Column(name="mentor_id") private Long mentor_id;
		 */
	 //unique courses must have unique mid and folowing all the entity
	    
	    //import sid from technology.java
		/*
		 * @Column(name="skill_id") private Long skill_id;
		 */
	    
	    @Column(name="self_rating")
	    private BigDecimal selfRating;

	    @Column(name="yoe")
	    private Integer yoe;

	    @Column(name="training_delivered")
	    private Integer trainingDelivered ;
	    
		/*
		 * @Column(name="facilities_offered") private String facilities_offered;
		 */
	    @Column(name = "technology_name")
	    private String technologyName ;
	    
	    @Column(name = "prerequisites") 
	    private String prerequisites ;
	    
	    @Column(name="toc")
	    private String toc ;

	    @Column(name="start_date")
	    private Date startDate ;

	    @Column(name="end_date")
	    private Date endDate ;
	    
		/*
		 * @ManyToMany(mappedBy="mentorskills",fetch = FetchType.EAGER)
		 * 
		 * @JsonBackReference private Set<Mentor> mentors;
		 * 
		 * 
		 * public Set<Mentor> getMentors() { return mentors; }
		 * 
		 * 
		 * public void setMentors(Set<Mentor> mentors) { this.mentors = mentors; }
		 */

	    
	    public int getId() {
			return id;
		}


		public BigDecimal getSelfRating() {
			return selfRating;
		}


		public void setSelfRating(BigDecimal selfRating) {
			this.selfRating = selfRating;
		}


		public Integer getYoe() {
			return yoe;
		}


		public void setYoe(Integer yoe) {
			this.yoe = yoe;
		}


		public Integer getTrainingDelivered() {
			return trainingDelivered;
		}


		public void setTrainingDelivered(Integer trainingDelivered) {
			this.trainingDelivered = trainingDelivered;
		}


		public String getTechnologyName() {
			return technologyName;
		}


		public void setTechnologyName(String technologyName) {
			this.technologyName = technologyName;
		}


		public String getPrerequisites() {
			return prerequisites;
		}


		public void setPrerequisites(String prerequisites) {
			this.prerequisites = prerequisites;
		}


		public String getToc() {
			return toc;
		}


		public void setToc(String toc) {
			this.toc = toc;
		}


		public Date getStartDate() {
			return startDate;
		}


		public void setStartDate(Date startDate) {
			this.startDate = startDate;
		}


		public Date getEndDate() {
			return endDate;
		}


		public void setEndDate(Date endDate) {
			this.endDate = endDate;
		}


		


		@Override
		public String toString() {
			return "MentorSkill [id=" + id + ", selfRating=" + selfRating + ", yoe=" + yoe + ", trainingDelivered="
					+ trainingDelivered + ", technologyName=" + technologyName + ", prerequisites=" + prerequisites
					+ ", toc=" + toc + ", startDate=" + startDate + ", endDate=" + endDate + "]";
		}


		public MentorSkill(int id, BigDecimal selfRating, Integer yoe, Integer trainingDelivered, String technologyName,
				String prerequisites, String toc, Date startDate, Date endDate) {
			super();
			this.id = id;
			this.selfRating = selfRating;
			this.yoe = yoe;
			this.trainingDelivered = trainingDelivered;
			this.technologyName = technologyName;
			this.prerequisites = prerequisites;
			this.toc = toc;
			this.startDate = startDate;
			this.endDate = endDate;
		}


		public void setId(int id) {
			this.id = id;
		}


		public MentorSkill() {
			super();
			// TODO Auto-generated constructor stub
		}




	    
		


}
