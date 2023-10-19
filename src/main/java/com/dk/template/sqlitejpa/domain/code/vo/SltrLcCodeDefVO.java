package com.dk.template.sqlitejpa.domain.code.vo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@ToString
@EqualsAndHashCode(callSuper = false)
@JsonInclude(value = JsonInclude.Include.ALWAYS)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SltrLcCodeDefVO {

    @JsonProperty("OBJ_ID")
    private String OBJ_ID;
    @JsonProperty("CODE_CLASS_ID")
    private String CODE_CLASS_ID;
    @JsonProperty("CODE_ID")
    private String CODE_ID;
    @JsonProperty("KOR_CODE_NAME")
    private String KOR_CODE_NAME;
    @JsonProperty("ENG_CODE_NAME")
    private String ENG_CODE_NAME;
    @JsonProperty("USE_YN")
    private String USE_YN;
    @JsonProperty("DESCRIPT")
    private String DESCRIPT;

    @JsonProperty("CREATE_USER_ID")
    private String CREATE_USER_ID;

    @JsonProperty("UPDATE_USER_ID")
    private String UPDATE_USER_ID;
}