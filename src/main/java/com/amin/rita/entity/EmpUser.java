package com.amin.rita.entity;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class EmpUser {

    @Id
    private Integer id;

    private String name;

    private String family;

    private String phoneNumber;

    private String nid;


}
