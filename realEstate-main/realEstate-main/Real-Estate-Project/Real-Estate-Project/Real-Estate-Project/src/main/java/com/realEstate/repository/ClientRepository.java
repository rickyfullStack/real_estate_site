package com.realEstate.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.realEstate.entity.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Integer> {

	@Query("SELECT s FROM Client s WHERE s.email=?1 AND s.password=?2")
	Client loginClient(String email, String password);

}
