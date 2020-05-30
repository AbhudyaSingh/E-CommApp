package com.orz.webappex.dao;
import java.util.List;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import com.orz.webappex.Model.Users;
public interface DbUsers extends CrudRepository<Users, Integer>{

	@Query( " from users where email = :email")
	List<Users> findByEmail(@Param("email") String email);
	
	
}
