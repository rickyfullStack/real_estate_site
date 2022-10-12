package com.realEstate.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.realEstate.entity.Property;

	@Repository
	public interface PropertyRepository extends JpaRepository<Property, String> {

		@Query("SELECT s FROM Property s WHERE s.street=?1")
		Property searchStreet(String street);
		
		@Query("SELECT s FROM Property s WHERE s.city=?1")
		Property searchCity(String city);
		
		@Query("SELECT s FROM Property s WHERE s.state=?1")
		Property searchState(String state);
		
		@Query("SELECT s FROM Property s WHERE s.zip=?1")
		Property searchZip(Integer zip);
		
		@Query("SELECT s FROM Property s WHERE s.houseSize=?1")
		Property searchHouseSize(Integer houseSize);
		
		@Query("SELECT s FROM Property s WHERE s.salePrice=?1")
		Property searchSalePrice(Integer salePrice);
		
		@Query("SELECT s FROM Property s WHERE s.id=?1")
		Property searchById(Integer id);
}