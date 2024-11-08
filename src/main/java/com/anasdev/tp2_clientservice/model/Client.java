package com.anasdev.tp2_clientservice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@ToString
@Entity
public class Client {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
}
