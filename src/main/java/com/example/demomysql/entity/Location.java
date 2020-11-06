package com.example.demomysql.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

/**
 * @author HariomYadav
 * @since 30/10/20
 */
@Getter
@Setter
@Entity
@JsonInclude(JsonInclude.Include.NON_EMPTY) // not show null values in json
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int locationId;
    String locationName;
}
