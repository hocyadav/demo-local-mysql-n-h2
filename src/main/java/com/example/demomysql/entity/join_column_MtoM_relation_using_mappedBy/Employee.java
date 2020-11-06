package com.example.demomysql.entity.join_column_MtoM_relation_using_mappedBy;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author HariomYadav
 * @since 06/11/20
 */
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table
public class Employee {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;

    String name;

        // working - but create 3rd table
//    @OneToMany (fetch = FetchType.LAZY)
//    private List<Email> emails;

    //working - not create 3rd table , mapped by value ?? - i tried changing table name n not eorking, check for maped by ??
    @OneToMany (fetch = FetchType.LAZY, mappedBy = "employee")
    private List<Email> emails;
}
