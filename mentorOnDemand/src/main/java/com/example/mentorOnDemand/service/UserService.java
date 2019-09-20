package com.example.mentorOnDemand.service;

import com.example.mentorOnDemand.model.User;
import com.example.mentorOnDemand.model.UserLogin;

public interface UserService {
	User loginUser(UserLogin userlogin);

	boolean registerUser(User user);

	User getUserDetails(int id);
}
