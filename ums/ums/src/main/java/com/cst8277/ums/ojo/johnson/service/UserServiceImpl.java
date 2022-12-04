package com.cst8277.ums.ojo.johnson.service;

import com.cst8277.ums.ojo.johnson.data.models.User;
import com.cst8277.ums.ojo.johnson.data.payloads.request.UserRequest;
import com.cst8277.ums.ojo.johnson.data.payloads.response.MessageResponse;
import com.cst8277.ums.ojo.johnson.data.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public MessageResponse createUser(UserRequest userRequest){
        User newUser = new User();
        newUser.setName(userRequest.getName());
        newUser.setEmail(userRequest.getEmail());
        newUser.setPassword(userRequest.getPassword());
        newUser.setRole(userRequest.getRole());
        userRepository.save(newUser);
        return new MessageResponse("New Employee created successfully");
    }

//    @Override
//    public Optional<User> updateUser(UUID userid, UserRequest userRequest) throws ResourceNotFoundException {
//        Optional<User> user = userRepository.findById(userid);
//        if(user.isEmpty()){
//            throw new ResourceNotFoundException("User", "id", userid);
//        } else
//            user.get().setName(userRequest.getName());
//            user.get().setEmail(userRequest.getEmail());
//            user.get().setPassword(userRequest.getPassword());
//            user.get().setRole(userRequest.getRole());
//            userRepository.save(user.get());
//
//        return user;
//    }
//    @Override
//    public User getASingleUser(UUID userid) throws ResourceNotFoundException {
//        return userRepository.findById(userid).orElseThrow(() -> new  ResourceNotFoundException("user", "id", userid));
//    }
//
    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }
//
//    @Override
//    public void deleteUser(UUID userid) throws ResourceNotFoundException{
//        if(userRepository.getById(userid).getUserid().equals(userid)){
//            userRepository.deleteById(userid);
//        }else{
//            throw new ResourceNotFoundException("user", "id", userid);
//        }
//    }

}

