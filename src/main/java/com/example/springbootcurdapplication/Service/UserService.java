package com.example.springbootcurdapplication.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springbootcurdapplication.Entity.User;
import com.example.springbootcurdapplication.Repository.Repository;

@Service
public class UserService {
    @Autowired
   private Repository userRepository;

   public User createUser(User user){
    return userRepository.save(user);
   }

   public List<User> createUsers(List<User> user){
    return userRepository.saveAll(user);
   }

   public User getUserById(int id){
    return userRepository.findById(id).orElse(null);
   }
   public List<User> getUsers(){
    return userRepository.findAll();
   }

   public User updateUser(User user){
    Optional<User> optionaluser=userRepository.findById(user.getId());
    if(optionaluser.isPresent()){
        User oldUser=optionaluser.get();
        oldUser.setName(user.getName());
        oldUser.setAddress(user.getAddress());
        userRepository.save(oldUser);
        return oldUser;
    }
    else{
        return new User();
    }
   }

   public String deleteUserById(int id){
    userRepository.deleteById(id);
    return "User got deleted";
   }
}
