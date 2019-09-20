package com.example.mentorOnDemand.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.mentorOnDemand.model.Mentor;

public interface MentorDao extends JpaRepository<Mentor, Integer>{

	Mentor findByUsername(String username);

}