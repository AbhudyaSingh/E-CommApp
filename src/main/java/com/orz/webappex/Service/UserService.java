package com.orz.webappex.Service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.orz.webappex.Model.Users;
import com.orz.webappex.dao.DbUsers; 

@Service
public class UserService {
	@Autowired 
	private DbUsers db;

	public String addUser(Users user) {
		List<Users> alreadyExist = db.findByEmail(user.getEmail()) ;
	
		if ((int)alreadyExist.size() > 0) 
			return  "User Already Exist With This Email ";
		db.save(user);
		String mssg = user.getName()+" Your account has been sucessfully created \n "
					+ "Uid : "+ user.getUid()+"\n Password: "+user.getPassword() ; 
		return mssg ;
		

	}
	public Users findUser(int uid ){
		Optional<Users> user = db.findById(uid);
		return user.orElse(null); 
	}
	
	public String [] grantAcess(Users user , String pass ){
		
		String []res = new String[2];
		res[0] = "loggedin";
		if (user == null)
		{
			res[1] = "User Does not exist";
			return res ; 
		}
		String correctPass = user.getPassword();
		boolean ok  =  correctPass.equals(pass) ;
		if (!ok) 
			res[1] ="Invalid Password"; 
		
		if(user.getUid() == 0 && ok )
		{	
			res[0] ="admin";
			res[1] ="Welcome Admin";
		}
		else if ( ok ) {
			res[0] ="index";
			res[1] ="Welcome";
		}
		
		return res;
	}
	
	
}
