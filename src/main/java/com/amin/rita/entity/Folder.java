package com.amin.rita.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Folder {
    @Id
    private int id;

    @ManyToMany
    private List<Message> messages;

    private String name;

    @ManyToOne
    private EmpUser user;


}
