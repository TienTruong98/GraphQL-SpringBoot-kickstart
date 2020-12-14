package com.tientt.graphqlkickstater.resolvers;

import com.tientt.graphqlkickstater.entities.User;
import com.tientt.graphqlkickstater.entities.UserInput;
import com.tientt.graphqlkickstater.services.UserService;
import graphql.kickstart.tools.GraphQLMutationResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Mutation implements GraphQLMutationResolver {
    @Autowired
    UserService userService;

    public User addUser(UserInput userInput){
        return  userService.addUser(userInput);
    }
}
