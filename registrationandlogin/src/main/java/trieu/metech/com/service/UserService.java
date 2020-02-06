package trieu.metech.com.service;

import trieu.metech.com.entity.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}