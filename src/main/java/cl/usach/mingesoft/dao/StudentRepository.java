package cl.usach.mingesoft.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import cl.usach.mingesoft.models.Students;

@Repository
@Transactional
public interface StudentRepository extends CrudRepository<Students, Integer> {
	List<Students> findAll(); 	
}
