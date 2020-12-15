package com.tientt.graphqlkickstater.resolvers;

import com.tientt.graphqlkickstater.pojo.entities.Schedule;
import com.tientt.graphqlkickstater.pojo.entities.User;
import com.tientt.graphqlkickstater.services.ScheduleService;
import graphql.kickstart.tools.GraphQLResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class UserResolver implements GraphQLResolver<User> {

    @Autowired
    ScheduleService scheduleService;

    public List<Schedule> schedules(User user){
        return scheduleService.getAllScheduleByUserID(user.getUsername());
    }
}
