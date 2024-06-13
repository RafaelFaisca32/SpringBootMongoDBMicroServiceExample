package User.Service;

import User.Domain.User;
import User.Domain.UserDTO;
import User.Repository.IUserRepository;

public class UserService implements IUserService{

    private final IUserRepository userRepository;

    public UserService(IUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    //Create Mappers for User to UserDTO
    @Override
    public UserDTO loginUser(UserDTO userDTO) {
        User loggedUser = userRepository.findByUsername(userDTO.getUsername());
        if(loggedUser != null && userDTO.getPassword().equals(loggedUser.getPassword())){
            return loggedUser;
        } else {
            return null;
        }
    }


}
