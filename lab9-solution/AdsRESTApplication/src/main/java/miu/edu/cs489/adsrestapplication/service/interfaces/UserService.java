package miu.edu.cs489.adsrestapplication.service.interfaces;

import miu.edu.cs489.adsrestapplication.model.User;

public interface UserService {
    User getUserByUsername(String username);
    User registerNewUser(User user);

}
