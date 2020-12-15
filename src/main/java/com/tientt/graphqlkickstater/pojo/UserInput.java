package com.tientt.graphqlkickstater.pojo;

import lombok.Data;

@Data
public class UserInput {
    private String username;
    private String password;
    private String lastname;
    private boolean role;
}
