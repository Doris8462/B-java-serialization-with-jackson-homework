package com.thoughtworks.capability.gtb.vo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.thoughtworks.capability.gtb.serializer.TimeDeserializer;
import com.thoughtworks.capability.gtb.serializer.TimeSerializer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EventVo {

  private String id;
  private String name;
  private EventType type;
  @JsonDeserialize(using = TimeDeserializer.class)
  @JsonSerialize(using = TimeSerializer.class)
  private Date time;
  @JsonUnwrapped
  private UserVo user;
}
