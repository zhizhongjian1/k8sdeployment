package com.k8s.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Account {
    @Id
    @Column(length = 30)
    private String userId;
    @Column(length = 30)
    private String password;
}