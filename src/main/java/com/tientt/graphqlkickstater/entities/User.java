package com.tientt.graphqlkickstater.entities;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@NoArgsConstructor
@Getter @Setter
@Entity
@Table(name = "TblRegistration")
public class User {
    @Id
    @Column(name = "username")
    private String username;
    @Column(name = "password")
    private String password;
    @Column(name = "lastname")
    private String lastname;
    @Column(name = "isAdmin")
    private boolean role;
}
