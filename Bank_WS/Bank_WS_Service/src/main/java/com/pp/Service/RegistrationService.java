package com.pp.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pp.Repository.RegistrationRepo;
import com.pp.model.RegistrationDto;

@Service
public class RegistrationService {
	
	
	@Autowired
	private RegistrationRepo rr;

	public void registerServiceMethod(RegistrationDto rd)
	{
		
		System.out.println("inside registration Service method");
		rr.regRepoMethod(rd);
	}
	
	
 public List<RegistrationDto> findRegistrationervice()
	 {
		 System.out.println("find product service ()");
		 List<RegistrationDto> list=rr.findRegistration();
		 return list;
	 }
 public RegistrationDto getData(int id)
 {
	 RegistrationDto rd=rr.getData(id);
	 return rd;
	 
 }
}
