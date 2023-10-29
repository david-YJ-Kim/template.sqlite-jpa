package com.dk.template.sqlitejpa.domain.sampleEntity.service;

import com.dk.template.sqlitejpa.domain.sampleEntity.dao.SampleEntityResponseDao;
import com.dk.template.sqlitejpa.domain.sampleEntity.dto.SampleEntityResponseDto;
import com.dk.template.sqlitejpa.domain.sampleEntity.jpa.SampleEntity;
import com.dk.template.sqlitejpa.domain.sampleEntity.jpa.SampleEntityRepository;
import com.dk.template.sqlitejpa.domain.sampleEntity.dto.SampleEntitySaveRequestDto;
import com.dk.template.sqlitejpa.domain.sampleEntity.mapper.SampleEntityMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor //Bean 주입 -> @Autowired 대신 생성자로
@Service
public class SampleEntityService {
    private final SampleEntityRepository sampleEntityRepository;

    @Autowired
    SampleEntityMapper mapper;
    public Long save(SampleEntitySaveRequestDto requestDto){
        return sampleEntityRepository.save(requestDto.toEntity()).getId();
    }


    public List<SampleEntityResponseDao> getAllResponse(){
        return mapper.getSampleEntities();
    }

    public List<SampleEntity> getAllResponseJpa(){
        return sampleEntityRepository.findAll();
    }


}
