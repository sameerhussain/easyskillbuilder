package com.topsafder.easySpringSkillBuilder.service;

import com.topsafder.easySpringSkillBuilder.model.Train;
import com.topsafder.easySpringSkillBuilder.repository.TrainRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class TrainService {

    @Autowired
    TrainRepository trainRepository;

    public List<Train> getAllTrains(String id) {
        List<Train> trainList = new ArrayList<>();
        if (id == null) {
            trainRepository.findAll().forEach(trainList::add);
            for(Train train : trainList) {
                System.out.println(train.toString());
            }
        } else {
            Long idValue;
            try {
                idValue = Long.valueOf(id);
            } catch(Exception e) {
                return null;
            }
            Optional<Train> optional = trainRepository.findById(idValue);
            optional.ifPresent(trainList::add);
        }
        return trainList;
    }
}
