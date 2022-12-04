package com.cst8277.ums.ojo.johnson.service;

import com.cst8277.ums.ojo.johnson.data.models.User;
import com.cst8277.ums.ojo.johnson.data.payloads.request.UserRequest;
import com.cst8277.ums.ojo.johnson.data.payloads.response.MessageResponse;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface UserService {
    MessageResponse createUser(UserRequest userRequest);
//    Optional<User> updateUser(UUID userid, UserRequest userRequest ) throws ResourceNotFoundException;
//    void deleteUser(UUID userid) throws ResourceNotFoundException;
//    User getASingleUser(UUID userid) throws ResourceNotFoundException;
    List<User> getAllUser();
}



