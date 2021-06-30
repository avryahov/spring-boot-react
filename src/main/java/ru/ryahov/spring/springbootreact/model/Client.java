package ru.ryahov.spring.springbootreact.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "client")
@NoArgsConstructor
@Getter
@Setter
public class Client {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String email;

    public Client(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public Client(Long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }
}