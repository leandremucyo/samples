package com.apps.userservice.service.api;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

import com.apps.userservice.config.ServiceConfig;
import com.apps.userservice.model.RegistrationData;
import com.apps.userservice.model.Users;
import com.google.gson.JsonObject;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "users")
public class UserServiceApi {

    Logger LOGGER = LoggerFactory.getLogger(UserServiceApi.class);
    private static final Map<String,Users> USERS = new ConcurrentHashMap<>();
    private static final Set<String> INVITATIONS = new HashSet<>();
    @Autowired
    private ServiceConfig serviceConfig;

    @GetMapping("/{userId}")
    public Users getUser(@PathVariable final String userId){
        LOGGER.info(serviceConfig.getSuccess());
        Users user = USERS.get(userId);
        LOGGER.info("Getting User for ID:" + userId);
        return user;
    }
    @GetMapping("/information")
    public RegistrationData userInformation() {
        RegistrationData sampleData = new RegistrationData();
        sampleData.setFirstName("firstName:[Optional]");
        sampleData.setLastName("lastName:[Optional]");
        sampleData.setPhoneNumber("phoneNumber:[Optional]");
        sampleData.setEmailAddress("someemail@domain.com:[Required]");
        sampleData.setRegistrationId("INVITATION ID");
        sampleData.setUserName("yourfavoritenickname[Optional]:15 Chars");
        return sampleData;
    }
    @PostMapping("/")
    public JsonObject registerUser(@RequestBody RegistrationData data) {
        Users user = null;
        JsonObject ret = new JsonObject();
        if(data != null && StringUtils.isNotBlank(data.getRegistrationId()) 
            && INVITATIONS.contains(data.getRegistrationId())){
            user = new Users();
            user.setFirstName(data.getFirstName());
            user.setLastName(data.getLastName());
            user.setUserName(data.getEmailAddress());
            user.setPhoneNumber(data.getPhoneNumber());
            user.setUserId(UUID.randomUUID().toString());
            if(user.getUserEmailId() != null && !USERS.containsKey(user.getUserEmailId())){
                USERS.put(user.getUserEmailId(), user);
                ret.addProperty("code", "200");
                ret.addProperty("message", "Succefully Registered");
                ret.addProperty("Account ID", user.getUserId());
            }else if(USERS.containsKey(user.getUserEmailId())){
                ret.addProperty("code", "409");
                ret.addProperty("message", "Conflict - An account exist with Email : " + data.getEmailAddress());
            }

        }
        return ret;
    }
}