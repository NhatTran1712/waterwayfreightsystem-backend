package org.apptopia.waterwayfreightsystem.api.api.core.model;

import java.util.List;
import java.util.Optional;

public interface ScheduleRepository {
	
	Schedule save(Schedule schedule);
	List<Schedule> findAll();
	Optional<Schedule> findById(Long idSchedule);
	Optional<Schedule> findByNameSchedule(String nameSchedule); 
	List<Schedule> findByNameScheduleContaining(String nameSchedule);
	void deleteById(Long idSchedule);
}
