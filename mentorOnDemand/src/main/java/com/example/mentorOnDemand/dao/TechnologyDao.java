package com.example.mentorOnDemand.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.mentorOnDemand.model.Technology;

@Repository
public interface TechnologyDao extends JpaRepository<Technology, Integer>{

	
}