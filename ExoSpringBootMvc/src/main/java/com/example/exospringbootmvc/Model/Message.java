package com.example.exospringbootmvc.Model;


import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class Message {
@Id
@GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime timeStamp;
    private String message;
    private String autor;

    public Message(String message, String autor) {
        this.timeStamp = LocalDateTime.now();
        this.message = message;
        this.autor = autor;
    }

    public Message() {
    }

    public LocalDateTime getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(LocalDateTime timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}


