package com.dk.template.sqlitejpa.rest;

import com.dk.template.sqlitejpa.domain.sampleEntity.dto.SampleEntityResponseDto;
import com.dk.template.sqlitejpa.domain.sampleEntity.dto.SampleEntitySaveRequestDto;
import com.dk.template.sqlitejpa.domain.sampleEntity.jpa.SampleEntity;
import com.dk.template.sqlitejpa.domain.sampleEntity.service.SampleEntityService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
public class SampleEntityController {

    @Autowired
    SampleEntityService sampleEntityService;

    @RequestMapping(value = "/test", method = RequestMethod.POST)
    public void save(@RequestBody SampleEntitySaveRequestDto requestDto){
        log.info(requestDto.toString());
        sampleEntityService.save(requestDto);

        List<SampleEntity> allSampleEntityResponse = sampleEntityService.getAllResponse();
        log.info(allSampleEntityResponse.toString());
    }
}
