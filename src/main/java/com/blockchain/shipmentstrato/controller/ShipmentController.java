package com.blockchain.shipmentstrato.controller;

import com.blockchain.shipmentstrato.model.Shipment;
import com.blockchain.shipmentstrato.service.ShipmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/shipment")
public class ShipmentController {

	private ShipmentService shipmentService;

	@Autowired
	public void setShipmentService(ShipmentService shipmentService) {
		this.shipmentService = shipmentService;
	}

	@PostMapping
	public String insertShipment(@RequestBody Shipment shipment) {
		shipmentService.insertIntoDynamoDB(shipment);
		return "Successfully inserted into shipmentstrato";
	}
}