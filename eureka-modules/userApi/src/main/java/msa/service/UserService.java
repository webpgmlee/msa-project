package msa.service;

import msa.DTO.UserDTO;

public interface UserService {
    public UserDTO getUser(String id);
    public UserDTO signUp(UserDTO user);
    public boolean login(UserDTO user);
}
