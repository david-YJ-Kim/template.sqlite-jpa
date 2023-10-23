package com.dk.template.sqlitejpa.domain.sampleEntity.dto;

import com.dk.template.sqlitejpa.domain.sampleEntity.jpa.SampleEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class SampleEntitySaveRequestDto implements CommonDto {

    private String sampleEntityMessage;
    private String sampleEntityContent;

    @Builder
    public SampleEntitySaveRequestDto(String sampleEntityMessage, String sampleEntityContent) {
        this.sampleEntityMessage = sampleEntityMessage;
        this.sampleEntityContent = sampleEntityContent;
    }

    @Override
    public SampleEntity toEntity() {
        return SampleEntity.builder()
                .sampleEntityMessage(sampleEntityMessage)
                .sampleEntityContent(sampleEntityContent)
                .build();
    }

    @Override
    public String toString() {
        return "SampleEntitySaveRequestDto{" +
                "sampleEntityMessage='" + sampleEntityMessage + '\'' +
                ", sampleEntityContent='" + sampleEntityContent + '\'' +
                '}';
    }
}
