package com.example.mentorOnDemand.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mentorOnDemand.dao.MentorDao;
import com.example.mentorOnDemand.dao.UserDao;
import com.example.mentorOnDemand.model.Mentor;
import com.example.mentorOnDemand.model.User;
import com.example.mentorOnDemand.model.UserLogin;

@Service
public class MentorServiceImpl implements MentorService{
	@Autowired
	private MentorDao mentorDao;

	/*@Override
	public User loginMentor(Mentor userlogin) {
		// TODO Auto-generated method stub
		return userDao.findByEmail(userlogin.getEmail());
	}*/

	@Override
	public boolean registerMentor(Mentor mentor) {
		// TODO Auto-generated method stub
		Mentor mentor1=new Mentor();
		System.out.println(mentor);
		mentor1=mentorDao.save(mentor);
		if(mentor1!=null) {
			System.out.println(mentor1);
			return true;
		}
		else
			return false;
	}

	@Override
	public Mentor mentorLogin(String username, String password) {
		return mentorDao.findByUsername(username);
		
	}
}
