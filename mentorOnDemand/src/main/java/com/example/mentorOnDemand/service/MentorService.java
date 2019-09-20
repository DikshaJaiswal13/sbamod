package com.example.mentorOnDemand.service;

import com.example.mentorOnDemand.model.Mentor;
import com.example.mentorOnDemand.model.User;
import com.example.mentorOnDemand.model.UserLogin;

public interface MentorService {
	public Mentor mentorLogin(String username, String password);

	boolean registerMentor(Mentor mentor);

}
