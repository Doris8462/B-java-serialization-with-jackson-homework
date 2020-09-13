package com.thoughtworks.capability.gtb.serializer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import java.io.IOException;
import java.util.Date;

public class TimeSerializer extends StdSerializer<Date> {
    protected TimeSerializer() {
        super(Date.class);
    }

    @Override
    public void serialize(Date date, JsonGenerator gen, SerializerProvider provider)
            throws IOException {
        gen.writeNumber(String.valueOf(date.toInstant().toEpochMilli()));
    }
}
