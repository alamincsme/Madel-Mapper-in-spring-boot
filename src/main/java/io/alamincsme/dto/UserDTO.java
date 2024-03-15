package io.alamincsme.dto;

import lombok.Data;

@Data
public class UserDTO {
    private long id ;
    private String firstName;
    private String lastName;
    private String fullName;
    private String email;

}
