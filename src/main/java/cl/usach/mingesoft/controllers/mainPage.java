package cl.usach.mingesoft.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import cl.usach.mingesoft.dao.StudentRepository;

@Controller
@RequestMapping("/")
public class mainPage {
	@Autowired
    StudentRepository studentRepository;
	
	@GetMapping("/")
	public String main(){
		return "main";
	}
	
	
}
