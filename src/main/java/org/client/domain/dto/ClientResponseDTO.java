package org.client.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClientResponseDTO {

    private Long id;
    private String name;
    private String lastname;
    private int age;
    private LocalDate dateOfDate;
    private LocalDate dateProbableDeath;
}
