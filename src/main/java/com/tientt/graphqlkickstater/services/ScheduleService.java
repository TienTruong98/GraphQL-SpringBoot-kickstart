package com.tientt.graphqlkickstater.services;

import com.tientt.graphqlkickstater.pojo.entities.Schedule;
import com.tientt.graphqlkickstater.repositories.ScheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScheduleService {
    @Autowired
    ScheduleRepository scheduleRepository;
    public List<Schedule> getAllScheduleByUserID(String userID){
        return scheduleRepository.findAllByUserID(userID);
    }
    public List<Schedule> findByUserIDInRange(String userID, Long beginTime, Long endTime){
        System.out.println(userID + "-" + beginTime + "-" + endTime);
        return scheduleRepository.findByUserIDInRange(userID, beginTime, endTime);
    };

}
