package tn.esprit.consomiTounsi.service;

import java.util.List;

import org.springframework.data.domain.Page;

import tn.epsrit.consomiTounsi.entities.Event;


public interface EventService {
	List<Event> getAllEmployees();
	void saveEmployee(Event employee);
	Event getEmployeeById(long id);
	void deleteEmployeeById(long id);
	Page<Event> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection);
}
