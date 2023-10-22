package com.dk.template.sqlitejpa.domain.code.jpa.dto;

import com.dk.template.sqlitejpa.domain.code.jpa.SampleEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class SampleEntitySaveRequestDto implements CommonDto {

    private String message;

    @Builder
    public SampleEntitySaveRequestDto(String message) {
        this.message = message;
    }

    @Override
    public SampleEntity toEntity() {
        return SampleEntity.builder().message(message).build();
    }
}
