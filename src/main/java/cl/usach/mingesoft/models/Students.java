package cl.usach.mingesoft.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="estudiantes")
public class Students {
	@Id
	Integer id;
	String name;
	String rut;
	String course;
	Date dateBirth;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRut() {
		return rut;
	}
	public void setRut(String rut) {
		this.rut = rut;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public Date getDateBirth() {
		return dateBirth;
	}
	public void setDateBirth(Date dateBirth) {
		this.dateBirth = dateBirth;
	}
//	public Students() {
//	}
//	public Students(Integer id, String name, String rut, String course, Date dateBirth) {
//		this.id = id;
//		this.name = name;
//		this.rut = rut;
//		this.course = course;
//		this.dateBirth = dateBirth;
//	}
	public Students(String name, String rut, String course, Date dateBirth) {
		this.name = name;
		this.rut = rut;
		this.course = course;
		this.dateBirth = dateBirth;
	}
//	

}
