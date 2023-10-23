package com.dk.template.sqlitejpa.domain.sampleEntity.mapper;

import com.dk.template.sqlitejpa.domain.sampleEntity.dto.SampleEntityResponseDto;
import com.dk.template.sqlitejpa.domain.sampleEntity.jpa.SampleEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SampleEntityMapper {

    // select
    List<SampleEntity> getSampleEntities();
}
