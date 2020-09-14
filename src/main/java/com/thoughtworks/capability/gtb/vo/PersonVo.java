package com.thoughtworks.capability.gtb.vo;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.thoughtworks.capability.gtb.serializer.AgeNullSerializer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PersonVo {

    private String id;
    @JsonSerialize(nullsUsing = AgeNullSerializer.class)
    private Integer age;
    private String name;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String hobby;

}
