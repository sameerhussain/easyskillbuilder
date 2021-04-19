package com.topsafder.easySpringSkillBuilder.controllers;

import com.topsafder.easySpringSkillBuilder.model.Train;
import com.topsafder.easySpringSkillBuilder.service.TrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/api")
public class TrainController {

    @Autowired
    TrainService trainService;


    @GetMapping(value = "/trains", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Train>> getAllTrains() {
        try {
            List<Train> trains = trainService.getAllTrains(null);

            if (trains.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }

            return new ResponseEntity<>(trains, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping(value = "/trains/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Train>> getAllTrains(@PathVariable("id") String id) {
        try {
            List<Train> trains = trainService.getAllTrains(id);

            if (trains.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }

            return new ResponseEntity<>(trains, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
