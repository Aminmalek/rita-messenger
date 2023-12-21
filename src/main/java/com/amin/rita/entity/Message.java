package com.amin.rita.entity;


import java.security.Timestamp;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Data
public class Message {
    @Id
    private long id;

    @ManyToOne
    private EmpUser sender;

    @ManyToOne
    private EmpUser receiver;

    private long chatId;
    private int messageTypeId;
    private String mediaPath;
    private String messageText;
    private Boolean isSent;
    private Timestamp sentDate;
    private Boolean isReceived;
    private Timestamp receivedDate;
    private Boolean isSeen;
    private Timestamp seenDate;


}
