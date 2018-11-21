package com.apps.userservice.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.apps.userservice.config.ServiceConfig;
import com.apps.userservice.model.Users;

@RestController
@RequestMapping(value="user")
public class UserService {

    @Autowired
    private ServiceConfig serviceConfig;

	@RequestMapping(value="/{firstName}",method = RequestMethod.GET)
	public Users getUser( @PathVariable("firstName") String firstName) {

		Users user = new Users();
		user.setUserId(UUID.randomUUID().toString());
		user.setFirstName(firstName);
		user.setLastName(serviceConfig.getMessage()+" - "+serviceConfig.getSecret());

        return user;
    }

}