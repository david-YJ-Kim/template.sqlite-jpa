package com.dk.template.sqlitejpa.domain.code.jpa;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.persistence.Entity;

@NoArgsConstructor
@Getter
@Entity
public class SampleEntity {

    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;

    @Column(length = 500, nullable = false)
    private String message;

    @Builder
    public SampleEntity(Long id, String message) {
        Id = id;
        this.message = message;
    }
}
