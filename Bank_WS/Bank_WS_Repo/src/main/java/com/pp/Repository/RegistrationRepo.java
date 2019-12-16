package com.pp.Repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.pp.model.RegistrationDto;

@Repository
public class RegistrationRepo {
	
	
	  @Autowired
	  private HibernateTemplate h;
	  
	  public void regRepoMethod(RegistrationDto rd)
	  {
		  
		  System.out.println("inside registration repo ");
			h.save(rd);
	  }
	  
	    public List<RegistrationDto> findRegistration()
			{
				List<RegistrationDto> list=h.find("from RegistrationDto");
				System.out.println("inside find product");
				return list;
			}
	    public RegistrationDto getData(int id)
	    {
	    	List<RegistrationDto> l=h.find("from RegistrationDto rd where rd.ID=?",id);
	    	RegistrationDto rd=(RegistrationDto)l.get(0);
	    	return rd;
	    }



}
