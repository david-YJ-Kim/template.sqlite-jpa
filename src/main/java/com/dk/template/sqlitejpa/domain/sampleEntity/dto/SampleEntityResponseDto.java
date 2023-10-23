package com.dk.template.sqlitejpa.domain.sampleEntity.dto;

import com.dk.template.sqlitejpa.domain.sampleEntity.jpa.SampleEntity;
import lombok.Getter;

@Getter
public class SampleEntityResponseDto {
    private Long Id;
    private String sampleEntityMessage;
    private String sampleEntityContent;

    public SampleEntityResponseDto(SampleEntity entity) {
        this.Id = entity.getId();
        this.sampleEntityMessage = entity.getSampleEntityMessage();
        this.sampleEntityContent = entity.getSampleEntityContent();
    }
}
