package tn.esprit.consomiTounsi.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import tn.epsrit.consomiTounsi.entities.Event;
import tn.esprit.consomiTounsi.repository.EventRepository;


@Service
public class EventServiceImpl implements EventService {

	@Autowired
	private EventRepository employeeRepository;

	@Override
	public List<Event> getAllEmployees() {
		return employeeRepository.findAll();
	}

	@Override
	public void saveEmployee(Event employee) {
		this.employeeRepository.save(employee);
	}

	@Override
	public Event getEmployeeById(long id) {
		Optional<Event> optional = employeeRepository.findById(id);
		Event employee = null;
		if (optional.isPresent()) {
			employee = optional.get();
		} else {
			throw new RuntimeException(" Employee not found for id :: " + id);
		}
		return employee;
	}

	@Override
	public void deleteEmployeeById(long id) {
		this.employeeRepository.deleteById(id);
	}

	@Override
	public Page<Event> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection) {
		Sort sort = sortDirection.equalsIgnoreCase(Sort.Direction.ASC.name()) ? Sort.by(sortField).ascending() :
			Sort.by(sortField).descending();
		
		Pageable pageable = PageRequest.of(pageNo - 1, pageSize, sort);
		return this.employeeRepository.findAll(pageable);
	}
}
