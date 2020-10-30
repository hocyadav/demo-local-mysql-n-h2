package com.example.demomysql;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author HariomYadav
 * @since 30/10/20
 */
@Getter
@Setter
@NoArgsConstructor
@Entity
@ToString
@JsonInclude (JsonInclude.Include.NON_EMPTY)//while fectching value in postman , ignore field with null
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int personId;
    String name;
    Double salary;

    @Convert(converter = ConvertorClass.class)//working
    List<String> personList = new ArrayList<>();
}
