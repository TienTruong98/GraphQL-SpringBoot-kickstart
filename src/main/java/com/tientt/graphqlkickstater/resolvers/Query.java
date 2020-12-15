package com.tientt.graphqlkickstater.resolvers;

import com.tientt.graphqlkickstater.pojo.entities.Schedule;
import com.tientt.graphqlkickstater.pojo.entities.User;
import com.tientt.graphqlkickstater.services.ScheduleService;
import com.tientt.graphqlkickstater.services.UserService;
import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

@Component
public class Query implements GraphQLQueryResolver {
    @Resource
    UserService userService;
    @Resource
    ScheduleService scheduleService;

    User usersByUsername(String username){
        return userService.getUserByUsername(username);
    }

    List<User> allUsers(){
        return userService.getAllUsers();
    }

    List<Schedule> scheduleByUserID(String userID){
        return scheduleService.getAllScheduleByUserID(userID);
    }

    List<Schedule> scheduleByUserIDInRange(String userID, Long beginTime, Long endTime){
        return scheduleService.findByUserIDInRange(userID, beginTime, endTime);
    }

}
