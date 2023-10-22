package com.dk.template.sqlitejpa.domain.code.rest;

import com.dk.template.sqlitejpa.domain.code.jpa.dto.SampleEntitySaveRequestDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class SampleEntityController {

    @RequestMapping(value = "/test", method = RequestMethod.POST)
    public void save(@RequestBody SampleEntitySaveRequestDto requestDto){
        log.info(requestDto.toString());
    }
}
