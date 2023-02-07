package msa.service.impl;

import msa.DAO.UserDao;
import msa.DTO.UserDTO;
import msa.entity.UserEntity;
import msa.service.UserService;
import lombok.RequiredArgsConstructor;
import msa.util.UserEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserDao userDao;
    private final UserEncoder passwordEncoder;

    @Override
    public UserDTO getUser(String id) {
        UserEntity userEntity = userDao.getUser(id);
        UserDTO userDTO = new UserDTO(userEntity.getId(), userEntity.getPassword());
        return userDTO;
    }

    @Override
    public UserDTO signUp(UserDTO user) {
        String encodedPassword = passwordEncoder.encode(user.getPassword());
        UserEntity userEntity = new UserEntity(user.getId(),encodedPassword);
        userEntity = userDao.signUp(userEntity);
        UserDTO userDTO = new UserDTO(userEntity.getId(), userEntity.getPassword());
        return userDTO;
    }

    @Override
    public boolean login(UserDTO user) {
        UserEntity userEntity = userDao.getUser(user.getId());
        boolean isUser = passwordEncoder.matches(user.getPassword(), userEntity.getPassword());
        return isUser;
    }
}
