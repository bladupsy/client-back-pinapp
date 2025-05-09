package org.client.domain.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class ClientDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;
    private String name;
    private String lastname;
    private int age;
    private LocalDate date_birth;

    public ClientDTO() {
    }

    public ClientDTO(Long id, String name, String lastname, int age, LocalDate date_birth) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.date_birth = date_birth;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LocalDate getDateBirth() {
        return date_birth;
    }

    public void setDateBirth(LocalDate date_birth) {
        this.date_birth = date_birth;
    }

    @Override
    public String toString() {
        return "ClientDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                ", date_birth=" + date_birth +
                '}';
    }
}
