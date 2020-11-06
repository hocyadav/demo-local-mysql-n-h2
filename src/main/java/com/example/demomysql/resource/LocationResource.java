package com.example.demomysql;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author HariomYadav
 * @since 30/10/20
 */
@RestController
@RequestMapping("v1/loc")
public class LocationResource {
    @Autowired
    LocationDao locationDao;

    @RequestMapping(method = RequestMethod.GET)
    public List<Location> getAllLocations() {
          return locationDao.findAll();
    }


}
