package com.pp.Regcontroller;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pp.Service.RegistrationService;
import com.pp.model.RegistrationDto;



@Controller
public class RegistrationController 
{
    
	
	@Autowired
	 private RegistrationService rs;
	
    	@RequestMapping(value="/registration", method=RequestMethod.GET)
		public String showRegistration(Model m)
		{
			System.out.println("Inside registration controller");
			RegistrationDto rdto= new RegistrationDto();
			m.addAttribute("regUser",rdto);
			return "registration";
			}
		
    
    	@RequestMapping(value="/welcome",method=RequestMethod.POST)
		public String  saveRegistration(@ModelAttribute("regUser") RegistrationDto rdto)
		{
		  	System.out.println("check the fildes..");
		
				
			rs.registerServiceMethod(rdto);
			
			
			return "welcome";
		  }
    	
 	      
    	@ResponseBody
    	@RequestMapping(value = "/dummyshow/{ID}", method = RequestMethod.GET)
    	public RegistrationDto showLogin(@PathVariable String ID)
    	{
    		System.out.println("Inside Add Product controller");
    		int id=Integer.parseInt(ID);
    		RegistrationDto rd=rs.getData(id);
    		return rd;
    		
       }

}