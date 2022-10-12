package com.realEstate.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.realEstate.entity.Agent;

public interface AgentRepository extends JpaRepository<Agent, Integer> {

	@Query("SELECT a FROM Agent a WHERE a.email=?1 AND a.password=?2")
	Agent login(String email, String password);
}
