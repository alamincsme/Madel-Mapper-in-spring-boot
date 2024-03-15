package io.alamincsme.services;

import io.alamincsme.convert.UserDTOConverter;
import io.alamincsme.dto.UserDTO;
import io.alamincsme.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserDTOConverter userDTOConverter ;

   public UserDTO getUser() {
       User user = new User();
       user.setId(1254);
       user.setFirstName("Mohammad");
       user.setLastName("Alamin");
       user.setEmail("alamincsme@gmail.com");
       user.setPassword("1234");

       UserDTO userDTO = userDTOConverter.convertUserToUserDTO(user);
       return userDTO ;
   }

}
