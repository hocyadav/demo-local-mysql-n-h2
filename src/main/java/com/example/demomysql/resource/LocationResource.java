package com.example.demomysql.resource;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.example.demomysql.dao.LocationDao;
import com.example.demomysql.entity.Location;

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

    @RequestMapping(method = RequestMethod.POST)
    public Location setNewLocations(@RequestBody Location location) {
        return locationDao.save(location);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Optional<Location> setNewLocations(@PathVariable("id") Integer id) {
        return locationDao.findById(id);
    }


}
