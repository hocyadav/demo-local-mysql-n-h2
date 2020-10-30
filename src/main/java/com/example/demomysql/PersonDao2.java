package com.example.demomysql;

import java.util.List;
import javax.persistence.EntityManager;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * @author HariomYadav
 * @since 30/10/20
 */
@Repository
// use entity manager to get data from db for that we need table structure in mysql db
public class PersonDao2{// this class same as DAO class but using hibernate to execute query, not using JPA

    @Autowired
    EntityManager entityManager;

    public List<Person> findAll() {
        System.err.println("PersonDao2.findAll");
        // get current session using hibernate entity manager
        final Session currentSession = entityManager.unwrap(Session.class);
        // execute query
        final Query<Person> from_person = currentSession.createQuery("from Person", Person.class);
        // get result
        final List<Person> resultList = from_person.getResultList();
        return resultList;
    }
}
