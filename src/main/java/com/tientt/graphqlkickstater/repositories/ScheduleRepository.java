package com.tientt.graphqlkickstater.repositories;

import com.tientt.graphqlkickstater.pojo.entities.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ScheduleRepository extends JpaRepository<Schedule, Integer> {
    List<Schedule> findAllByUserID(String userID);


    @Query(value = "select s from Schedule s where s.userID=:userID and s.beginTime>=:beginTime and s.endTime<=:endTime")
    List<Schedule> findByUserIDInRange(@Param("userID") String userID,
                                       @Param("beginTime") Long beginTime,
                                       @Param("endTime") Long endTime);

}
