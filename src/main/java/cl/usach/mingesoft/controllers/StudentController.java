package cl.usach.mingesoft.controllers;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import cl.usach.mingesoft.dao.StudentRepository;
import cl.usach.mingesoft.models.Students;

@Controller
@RequestMapping("/estudiante")
public class StudentController {
	
	
	@Autowired
    StudentRepository repository;
	
	@GetMapping(path="/agregar")
	public String formStudentAdd() {
		return "agregar";
	}
	
	@GetMapping(path="/validar")
	public String validarFormulario(HttpServletRequest request,Model modelo) {
		String name = request.getParameter("name");
		String rut = request.getParameter("rut");
		String course = request.getParameter("course");
		String dateBirth = request.getParameter("dateBirth");
//		DateFormat format = new 
		String mensaje;
		if(name != null && rut != null && course != null && dateBirth != null &&
				! name.equals("") && ! rut.equals("") && ! course.equals("") && ! dateBirth.equals("")) {
			mensaje = "Gracias por registrar a ";
			mensaje+= name;
			modelo.addAttribute("mensaje", mensaje);
//			studentCreate(name,rut,course,);
			return "gracias";
		}else {
			mensaje = "Agrega valores en todos los campos";
			modelo.addAttribute("mensaje", mensaje);
			return "agregar";
		}
		
		
	}
	
	public Students studentCreate(String name,String rut, String course, Date dateBirth) {
		return repository.save(new Students(name,rut,course,dateBirth));
	}
}
