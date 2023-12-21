package com.amin.rita.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Group{
    @Id
    private Long id;

    private String name;

    private String category;

    @ManyToMany
    private List<EmpUser> members;


}
