package msa.DAO.impl;

import msa.DAO.UserDao;
import msa.entity.UserEntity;
import msa.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserDaoImpl implements UserDao {
    private final UserRepository userRepository;

    @Override
    public UserEntity getUser(String id) {
        return userRepository.getById(id);
    }

    @Override
    public UserEntity signUp(UserEntity user) {
        userRepository.save(user);
        return user;
    }

    @Override
    public UserEntity login(UserEntity user) {
        return userRepository.findByIdAndPassword(user.getId(), user.getPassword());
    }
}
