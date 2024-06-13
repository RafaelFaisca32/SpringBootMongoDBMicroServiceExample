package User.Repository;

import User.Domain.User;
import User.Domain.UserDTO;
import User.Domain.UserId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IUserRepository extends MongoRepository<User, UserId> {

    public User findByUsername(String username)
}
