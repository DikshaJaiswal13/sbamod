package com.example.mentorOnDemand.model;

import java.sql.Date;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mentor")
public class Mentor {

	 @Id
	    //@GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int id;
	   
	    @Column(name="username")
	    private String username;

	    @Column(name="linkedin_url")
	    private String linkedinUrl;

	    @Column(name="password")
	    private String password;
	    
	    @Column(name="contact")
	    private Long contact;

	    @Column(name="reg_date_time")
	    private Timestamp regDatetime ;

	    @Column(name="reg_code")
	    private String regCode;

//	    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
//	    @JoinTable(name = "mentor_details",
//	    inverseJoinColumns = @JoinColumn(name = "mentorskill_id"),
//	    joinColumns = @JoinColumn(name = "mentor_id"))
//	    @JsonManagedReference
//	    private Set<MentorSkill> mentorskills = new HashSet<MentorSkill>();
	//    
//	    public Set<MentorSkill> getMentorskills() {
//	  		return mentorskills;
//	  	}
//	  	public void setMentorskills(Set<MentorSkill> mentorskills) {
//	  		this.mentorskills = mentorskills;
//	  	}
	    
	    public int getId() {
			return id;
		}
		@Override
		public String toString() {
			return "Mentor [id=" + id + ", username=" + username + ", linkedinUrl=" + linkedinUrl + ", password="
					+ password + ", contact=" + contact + ", regDatetime=" + regDatetime + ", regCode=" + regCode + "]";
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getLinkedinUrl() {
			return linkedinUrl;
		}

		public void setLinkedinUrl(String linkedinUrl) {
			this.linkedinUrl = linkedinUrl;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public Long getContact() {
			return contact;
		}

		public void setContact(Long contact) {
			this.contact = contact;
		}

		public Timestamp getRegDatetime() {
			return regDatetime;
		}

		public void setRegDatetime(Timestamp regDatetime) {
			this.regDatetime = regDatetime;
		}

		public String getRegCode() {
			return regCode;
		}

		public void setRegCode(String regCode) {
			this.regCode = regCode;
		}
		
		public Mentor(int id, String username, String linkedinUrl, String password, Long contact, Timestamp regDatetime,
				String regCode) {
			super();
			this.id = id;
			this.username = username;
			this.linkedinUrl = linkedinUrl;
			this.password = password;
			this.contact = contact;
			this.regDatetime = regDatetime;
			this.regCode = regCode;
		}
		public Mentor() {
			super();
			// TODO Auto-generated constructor stub
		}

	    
	   
		
		

	
}
