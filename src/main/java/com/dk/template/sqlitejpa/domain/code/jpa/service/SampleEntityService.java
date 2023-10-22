package com.dk.template.sqlitejpa.domain.code.jpa.service;

import com.dk.template.sqlitejpa.domain.code.jpa.SampleEntity;
import com.dk.template.sqlitejpa.domain.code.jpa.SampleEntityRepository;
import com.dk.template.sqlitejpa.domain.code.jpa.dto.SampleEntitySaveRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@RequiredArgsConstructor //Bean 주입 -> @Autowired 대신 생성자로
@Service
public class SampleEntityService {
    private final SampleEntityRepository sampleEntityRepository;


    public Long save(SampleEntitySaveRequestDto requestDto){
        return sampleEntityRepository.save(requestDto.toEntity()).getId();
    }



}
