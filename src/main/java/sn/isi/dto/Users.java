package sn.isi.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.validation.constraints.NotNull;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Users {
    private int id;
    @NotNull(message = "Le nom ne doit pas etre null")
    private String nom;
    @NotNull(message = "L'email ne doit pas etre null")
    private String email;
    @NotNull(message = "Le telephone ne doit pas etre null")
    private int telephone;
    @NotNull(message = "Le mdp ne doit pas etre null")
    private String password;


}
