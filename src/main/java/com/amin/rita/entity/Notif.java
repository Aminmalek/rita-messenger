package com.amin.rita.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Notif {
    @Id
    private int Id;
    private String title;

    private String text;

    @ManyToOne
    private EmpUser toUser;

}
