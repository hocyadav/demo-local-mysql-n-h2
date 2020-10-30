package com.example.demomysql;

import java.util.Arrays;
import java.util.List;
import javax.persistence.AttributeConverter;

/**
 * @author HariomYadav
 * @since 30/10/20
 */
public class ConvertorClass implements AttributeConverter<List<String>, String> {
    @Override
    public String convertToDatabaseColumn(List<String> attribute) {
        return String.join(",", attribute);
    }
    @Override
    public List<String> convertToEntityAttribute(String dbData) {
        final String[] split = dbData.split(",");
        final List<String> list = Arrays.asList(split);
        return list;
    }
}
