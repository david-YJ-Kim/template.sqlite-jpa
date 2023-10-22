package com.dk.template.sqlitejpa.domain.code.jpa.dto;

import com.dk.template.sqlitejpa.domain.code.jpa.SampleEntity;
import lombok.Getter;

@Getter
public class SampleEntityResponseDto {
    private Long id;
    private String message;

    public SampleEntityResponseDto(SampleEntity entity) {
        this.id = entity.getId();
        this.message = entity.getMessage();
    }
}
