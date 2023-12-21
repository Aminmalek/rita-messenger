package com.amin.rita.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Channel {
    @Id
    private Long id;

    private String name;

    private String description;

    @OneToMany
    private List<Message> messages;

    @ManyToOne
    private EmpUser admin;

    @ManyToMany
    private List<EmpUser> members;

}
