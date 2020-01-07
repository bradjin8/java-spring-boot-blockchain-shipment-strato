package com.blockchain.shipmentstrato.service;


import com.blockchain.shipmentstrato.model.Shipment;
import com.blockchain.shipmentstrato.repository.ShipmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShipmentService{
    @Autowired
    private ShipmentRepository shipmentRepository;

    public void insertIntoDynamoDB(Shipment shipment) {
        shipmentRepository.insertIntoDynamoDB(shipment);
    }

}
