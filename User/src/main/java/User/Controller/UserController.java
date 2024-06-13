package User.Controller;

import User.Domain.CreatingUserDTO;
import User.Domain.UserDTO;
import User.Service.IUserService;
import org.apache.coyote.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/user")
public class UserController {

    Logger logger = LoggerFactory.getLogger(UserController.class);
    private IUserService userSerivce;

    public UserController(IUserService userSerivce) {
        this.userSerivce = userSerivce;
    }

    @PostMapping("/login")
    public ResponseEntity<UserDTO> login(@RequestBody UserDTO userDTO){
        UserDTO loggedUser = userSerivce.loginUser(userDTO);
        if(loggedUser != null) {
            logger.info("User logged in successfully");
            return ResponseEntity.ok().body(loggedUser);
        } else {
            logger.error("Cannot find a user with the data inserted", loggedUser.toString());
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/register")
    public ResponseEntity<UserDTO> register(@RequestBody CreatingUserDTO userDTO){
        // codigo do serviço
        return ResponseEntity.ok().body(userDTO);
    }
}
