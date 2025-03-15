package com.genie.Train.service;


import com.genie.Train.enitity.Train;
import com.genie.Train.repo.TrainRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrainService {

    private TrainRepository trainRepository;

    public TrainService(TrainRepository trainRepository)
    {
        this.trainRepository=trainRepository;
    }


    public List<Train> getAllTrains() {
        return trainRepository.findAll();
    }

    public Train addTrain(Train train) {
        return trainRepository.save(train);
    }
}
