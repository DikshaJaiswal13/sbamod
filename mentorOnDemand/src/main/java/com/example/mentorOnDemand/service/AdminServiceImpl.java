package com.example.mentorOnDemand.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mentorOnDemand.dao.MentorDao;
import com.example.mentorOnDemand.dao.TechnologyDao;
import com.example.mentorOnDemand.dao.UserDao;
import com.example.mentorOnDemand.model.Mentor;
import com.example.mentorOnDemand.model.Technology;
import com.example.mentorOnDemand.model.User;

@Service
public class AdminServiceImpl implements AdminService{
	
	@Autowired
	TechnologyDao technologyDao;
	@Autowired
	UserDao userDao;
	@Autowired
	MentorDao mentorDao;
	@Override
	public List<Technology> getSkillList() throws SQLException {
		// TODO Auto-generated method stub
		return technologyDao.findAll();
	}
	@Override
	public List<User> getUserList() throws SQLException {
		// TODO Auto-generated method stub
		return userDao.findAll();
	}
	@Override
	public List<Mentor> getMentorList() throws SQLException {
		// TODO Auto-generated method stub
		return mentorDao.findAll();
	}
	@Override
	public Technology getTechDetails(int id) {
		// TODO Auto-generated method stub
		return technologyDao.getOne(id);
	}
	@Override
	public void deleteUser(int id) {
		// TODO Auto-generated method stub
		userDao.deleteById(id);
	}
	
		
}
