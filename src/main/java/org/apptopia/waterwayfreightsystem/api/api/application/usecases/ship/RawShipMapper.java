package org.apptopia.waterwayfreightsystem.api.api.application.usecases.ship;

import org.apptopia.waterwayfreightsystem.api.api.authentication.account.Account;
import org.apptopia.waterwayfreightsystem.api.api.core.model.Schedule;
import org.apptopia.waterwayfreightsystem.api.api.core.model.TravelProblem;
import org.apptopia.waterwayfreightsystem.api.api.ship.model.Ship;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface RawShipMapper {
	RawShipMapper INSTANCE = Mappers.getMapper(RawShipMapper.class);
	
	public Ship fromRawInput(RawShipInput rawShipInput);
	
	public RawShipOutput fromShip(Ship ship);

	default Schedule toSchedule(Long idSchedule) {
		if(idSchedule == null || idSchedule == 0) {
			return null;
		}
		return new Schedule(idSchedule);
	}
	
	default Long fromSchedule(Schedule schedule) {
		if(schedule == null) {
			return null;
		}
		return schedule.getIdSchedule();
	}
	
	default TravelProblem toTravelProblem(Integer idTravelProblem) {
		if(idTravelProblem == null || idTravelProblem == 0) {
			return null;
		}
		return new TravelProblem(idTravelProblem);
	}
	
	default Integer fromTravelProblem(TravelProblem travelProblem) {
		if(travelProblem == null) {
			return null;
		}
		return travelProblem.getIdTravelProblem();
	}
	
	default Account toAccount(Long idUser) {
		if(idUser == null || idUser == 0) {
			return null;
		}
		return new Account(idUser);
	}
	
	default Long fromAccount(Account account) {
		if(account == null) {
			return null;
		}
		return account.getIdUser();
	}
}
