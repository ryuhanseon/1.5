package com.example.demo.User;


import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserCreateForm {

    @Size(min = 3, max = 25)
//    @NotEmpty(message = "사용자ID는 필수 입력사항입니다.")
    private String username;

//    @NotEmpty(message = "비밀번호를 입력해주세요")
    private String password1;

//    @NotEmpty(message = "비밀번호를 다시입력해주세요")
    private String password2;


}
