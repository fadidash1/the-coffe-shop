package com.example.demo.persistence.entity;

import javax.persistence.*;


@Entity
@Table(name = "user_type")
public class UserType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "type")
    private String type;

    public void setType(String type) {
        this.type = type;
    }

    public UserType() {}

    public UserType(Long userId, String type) {
        this.userId = userId;
        this.type = type;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }


    @Override
    public String toString() {
        return "UserType{" +
                "id=" + id +
                ", userId=" + userId +
                ", type=" + type +
                '}';
    }

}

