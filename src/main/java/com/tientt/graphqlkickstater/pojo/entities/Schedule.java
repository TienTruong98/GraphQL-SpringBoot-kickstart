package com.tientt.graphqlkickstater.pojo.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "TblSchedule")

public class Schedule {
    @Id
    private Integer id;
    private Long beginTime;
    private Long endTime;
    private String note;
    private String userID;
}
