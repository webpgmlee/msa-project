package msa.DAO;

import msa.entity.UserEntity;

public interface UserDao {
    public UserEntity getUser(String id);
    public UserEntity signUp(UserEntity user);
    public UserEntity login(UserEntity user);
}
