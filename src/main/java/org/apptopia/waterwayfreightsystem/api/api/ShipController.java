package org.apptopia.waterwayfreightsystem.api.api;

import java.util.List;

import org.apptopia.waterwayfreightsystem.api.api.application.ShipService;
import org.apptopia.waterwayfreightsystem.api.api.application.usecases.rawupdate.UpdateStatusForShipUseCase;
import org.apptopia.waterwayfreightsystem.api.api.application.usecases.ship.RawShipInput;
import org.apptopia.waterwayfreightsystem.api.api.application.usecases.ship.RawShipOutput;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/ship")
public class ShipController {
	private ShipService shipService;
	private UpdateStatusForShipUseCase updateStatusForShipUseCase;
	
	@Autowired
	public void setShipService(ShipService shipService,
		UpdateStatusForShipUseCase updateStatusForShipUseCase) {
		this.shipService = shipService;
		this.updateStatusForShipUseCase = updateStatusForShipUseCase;
	}
	
	@RequestMapping(value = {"/",""}, produces = "application/json",
		consumes = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
	@ResponseBody
	public List<RawShipOutput> getAllShips(){
		return shipService.findAllShips();
	}
	
	@RequestMapping(value = {"/update-status/","/update-status"}, produces = "application/json",
		consumes = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.PUT)
	@ResponseBody
	public RawShipOutput updateStatusForShip(@RequestBody RawShipInput rawShipInput) {
		return updateStatusForShipUseCase.handle(rawShipInput);
	}
}
