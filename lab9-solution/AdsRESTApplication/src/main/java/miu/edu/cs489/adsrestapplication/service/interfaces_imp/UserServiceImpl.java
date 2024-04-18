package miu.edu.cs489.adsrestapplication.service.interfaces_imp;

import miu.edu.cs489.adsrestapplication.model.User;
import miu.edu.cs489.adsrestapplication.repository.UserRepository;
import miu.edu.cs489.adsrestapplication.service.interfaces.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private UserRepository userRepository;
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    @Override
    public User getUserByUsername(String username) {
        return userRepository.findUserByUsername(username)
                .orElse(null);
    }

    @Override
    public User registerNewUser(User user) {
        return null;
    }


}
