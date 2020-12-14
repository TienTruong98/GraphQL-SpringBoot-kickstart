package com.tientt.graphqlkickstater.resolvers;

import com.tientt.graphqlkickstater.entities.User;
import com.tientt.graphqlkickstater.services.UserService;
import graphql.kickstart.tools.GraphQLQueryResolver;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

@Component
public class Query implements GraphQLQueryResolver {
    @Resource
    UserService userService;

    User usersByUsername(String username){
        return userService.getUserByUsername(username);
    }

    List<User> allUsers(){
        return userService.getAllUsers();
    }
}
