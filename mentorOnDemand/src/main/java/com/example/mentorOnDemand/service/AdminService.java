package com.example.mentorOnDemand.service;

import java.sql.SQLException;
import java.util.List;

import com.example.mentorOnDemand.model.Mentor;
import com.example.mentorOnDemand.model.Technology;
import com.example.mentorOnDemand.model.User;

public interface AdminService {
	
	public List<Technology> getSkillList() throws SQLException;

	public List<User> getUserList() throws SQLException;

	public List<Mentor> getMentorList() throws SQLException;

	public Technology getTechDetails(int id);

	public void deleteUser(int id);
}
