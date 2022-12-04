package com.cst8277.ums.ojo.johnson.controller;

import com.cst8277.ums.ojo.johnson.data.models.User;
import com.cst8277.ums.ojo.johnson.data.payloads.request.UserRequest;
import com.cst8277.ums.ojo.johnson.data.payloads.response.MessageResponse;
import com.cst8277.ums.ojo.johnson.service.UserService;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")

@ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 400, message = "This is a bad request, please follow the API documentation for the proper request format"),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Due to security constraints, your access request cannot be authorized"),
        @io.swagger.annotations.ApiResponse(code = 500, message = "The server is down. Please bear with us."),
}
)
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/users")
    public ResponseEntity<List<User>> getAllUsers(){
        List<User> users = userService.getAllUser();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

//    @GetMapping("/find/{id}")
//    public ResponseEntity<User> getUserById(@PathVariable("id") UUID id) throws ResourceNotFoundException {
//        User user  = userService.getASingleUser(id);
//        return new ResponseEntity<>(user, HttpStatus.OK);
//    }

    @PostMapping("/add")
    public ResponseEntity<MessageResponse> addUser(@RequestBody UserRequest user) {
        MessageResponse newUser = userService.createUser(user);
        return new ResponseEntity<>(newUser, HttpStatus.CREATED);
    }

//    @PutMapping("/update/{id}")
//    public Optional<User> updateUser(@PathVariable UUID id, @RequestBody UserRequest User) throws ResourceNotFoundException {
//        return userService.updateUser(id,User);
//    }
//
//    @DeleteMapping("/delete/{id}")
//    public ResponseEntity<?> deleteUser(@PathVariable("id") UUID id) throws ResourceNotFoundException {
//        userService.deleteUser(id);
//        return new ResponseEntity<>(HttpStatus.OK);
//    }
}
