package com.dk.template.sqlitejpa.domain.sampleEntity.jpa;

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
    private String sampleEntityMessage;

    @Column(length = 500, nullable = false)
    private String sampleEntityContent;



    @Builder
    public SampleEntity(Long id, String sampleEntityMessage, String sampleEntityContent) {
        Id = id;
        this.sampleEntityMessage = sampleEntityMessage;
        this.sampleEntityContent = sampleEntityContent;
    }

    @Override
    public String toString() {
        return "SampleEntity{" +
                "Id=" + Id +
                ", sampleEntityMessage='" + sampleEntityMessage + '\'' +
                ", sampleEntityContent='" + sampleEntityContent + '\'' +
                '}';
    }
}
