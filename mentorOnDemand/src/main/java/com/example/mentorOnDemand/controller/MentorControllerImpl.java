package com.example.mentorOnDemand.controller;

import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Random;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.mentorOnDemand.model.Mentor;
import com.example.mentorOnDemand.model.User;
import com.example.mentorOnDemand.model.UserLogin;
import com.example.mentorOnDemand.service.MentorService;
import com.example.mentorOnDemand.service.UserService;
import com.example.mentorOnDemand.service.UserServiceImpl;

@Controller
public class MentorControllerImpl {

	@Autowired 
	private MentorService mentorService;/* =new MentorServiceImpl(); */
	
	@RequestMapping(value = "/mentorLogin", method = RequestMethod.GET)
	public String userLogin(ModelMap model) throws SQLException {
		Mentor mentor=new Mentor();
		model.addAttribute("ml",mentor);
		return "mentorLogin";

	}
	
	/*@RequestMapping(value = "/mentorLogin", method = RequestMethod.POST) 
	public String loginUser(@Valid Mentor mentor, BindingResult result, Model model, HttpSession session) throws SQLException { 
		System.out.println("inside post method"); 
		System.out.println("password"+userlogin.getPassword());
		User user=userService.loginUser(userlogin);
		System.out.println("inside login controller..................."+user);
		if(user!=null && user.getPassword().equals(userlogin.getPassword())) {	
			session.setAttribute("user", user);
			return	"userDetails";
		}
		else 
			return "redirect:/userLogin"; 

	}
	
	@RequestMapping(value = "/userRegister", method = RequestMethod.GET)
	public String userRegistration(ModelMap model) throws SQLException {
		User user=new User();
		model.addAttribute("ul",user);
		return "userRegistration";

	}
	
	@RequestMapping(value = "/register", method = RequestMethod.POST) 
	public String registerUser(@Valid User user, BindingResult result, Model model, HttpSession session) throws SQLException {  
		Random r=new Random();
		int num = (r.nextInt(90000) + 10000);
		user.setId(Integer.valueOf(num));
		num=r.nextInt(9000)+1000;
		user.setRegCode(num);
		//java.util.Date d=new java.util.Date();
		//java.sql.Date date=new java.sql.Date(d.getTime());
		java.util.Date utilDate = new java.util.Date();
		System.out.println("java.util.Date : " + utilDate);

		java.sql.Timestamp sqlTimeStamp = convertJavaDateToSqlDate(utilDate);
		System.out.println("java.sql.Timestamp : " + sqlTimeStamp);
		user.setRegDatetime(sqlTimeStamp);
		System.out.println(sqlTimeStamp);
		user.setActive(1);
		System.out.println("inside post method....................."+user);
		if(userService.registerUser(user))
			return "redirect:/userLogin";
		else
			return "redirect:/userRegister";

	}
	
	public static java.sql.Timestamp convertJavaDateToSqlDate(java.util.Date date)
	{
		return new java.sql.Timestamp(date.getTime());
	}*/
	
	@RequestMapping(value = "/mentorRegister", method = RequestMethod.GET)
	public String mentorRegistration(ModelMap model) throws SQLException {
		Mentor m=new Mentor();
		model.addAttribute("mr",m);
		return "mentorRegistration";

	}
	
	
	@RequestMapping(value = "/mentorRegister", method = RequestMethod.POST) 
	public String registerUser(@Valid Mentor mentor, BindingResult result, Model model, HttpSession session) throws SQLException {  
		
		System.out.println("inside register post");
		Random r=new Random();
		int num = (r.nextInt(90000) + 10000);
		mentor.setId(Integer.valueOf(num));
		num=r.nextInt(9000)+1000;
		mentor.setRegCode(Integer.toString(num));
	
		
		
		
	java.util.Date utilDate = new java.util.Date();
		System.out.println("java.util.Date : " + utilDate);

		java.sql.Timestamp sqlTimeStamp = convertJavaDateToSqlDate(utilDate);
		System.out.println("java.sql.Timestamp : " + sqlTimeStamp);
		
		mentor.setRegDatetime(sqlTimeStamp);
	
		if(mentorService.registerMentor(mentor))
			return "redirect:/mentorLogin";
		else
			return "redirect:/mentorRegister";

	}
	
	@RequestMapping(value = "/mentorLogin", method = RequestMethod.POST) 
	public String loginMentor(@Valid Mentor mentor, BindingResult result, Model model, HttpSession session) throws SQLException { 
		System.out.println("inside login post"); 
		//System.out.println("password"+userlogin.getPassword());
		/*
		 * Mentor mentor=mentorService.loginUser(userlogin);
		 * 
		 * if(user!=null && user.getPassword().equals(userlogin.getPassword())) {
		 * session.setAttribute("user", user); return "userDetails"; } else return
		 * "redirect:/userLogin";
		 */
		
		
		System.out.println(mentor.getUsername());
		System.out.println(mentor.getPassword());
		Mentor m=new Mentor();
		m=mentorService.mentorLogin(mentor.getUsername(),mentor.getPassword());
		//model.addAttribute("name", employee.getName());
		System.out.println(m);
		/*	if((user.getUsername()==u.getUsername()) && (user.getPassword()==u.getPassword()))*/
		if(m!=null) {
			if(m.getPassword().equals(mentor.getPassword()))
				//session.setAttribute("user", u);
			{
				System.out.println("good credentials");
				//System.out.println(m.getEmail());
				//session.setAttribute("user", u);
				return "redirect:/mentorDetails";

			}
		}
		return "redirect:/mentorLogin";
	}
	

	
	public static java.sql.Timestamp convertJavaDateToSqlDate(java.util.Date date)
	{
		java.sql.Timestamp jst=new Timestamp(date.getTime());
		return jst;
	}
}
