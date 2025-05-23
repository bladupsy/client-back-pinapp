package org.client.domain.dto;

import java.io.Serializable;
import java.time.LocalDate;

public class ClientResponseDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;
    private String name;
    private String lastname;
    private int age;
    private LocalDate dateOfBirth;
    private LocalDate dateProbableDeath;

    public ClientResponseDTO() {
    }

    public ClientResponseDTO(Long id, String name, String lastname, int age, LocalDate dateOfBirth, LocalDate dateProbableDeath) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.dateOfBirth = dateOfBirth;
        this.dateProbableDeath = dateProbableDeath;
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

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public LocalDate getDateProbableDeath() {
        return dateProbableDeath;
    }

    public void setDateProbableDeath(LocalDate dateProbableDeath) {
        this.dateProbableDeath = dateProbableDeath;
    }

    @Override
    public String toString() {
        return "ClientResponseDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                ", dateOfBirth=" + dateOfBirth +
                ", dateProbableDeath=" + dateProbableDeath +
                '}';
    }
}
