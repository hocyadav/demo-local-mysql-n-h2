package com.example.demomysql.entity.join_column_MtoM_relation_using_mappedBy;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
public class Email {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn (name = "own_column_stores_employee_id")
    private Employee employee;
}
