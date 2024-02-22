package com.meli.interview.back.subscription_api.models.forms;

import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserForm {
    @NotBlank(message = "user name cannot be blank")
    @NotNull(message = "user name cannot be null")
    private String name;
}
