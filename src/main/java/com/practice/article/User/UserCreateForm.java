package com.practice.article.User;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserCreateForm {
    @Size(min = 3,max = 25)
    @NotEmpty(message = "ID를 입력해 주세요.")
    private String username;

    @NotEmpty(message = "PW를 입력해 주세요.")
    private String password1;

    @NotEmpty(message = "패스워드 재확인은 필수입니다.")
    private String password2;

    @NotEmpty(message = "e-mail을 입력해 주세요.")
    @Email
    private String email;
}
