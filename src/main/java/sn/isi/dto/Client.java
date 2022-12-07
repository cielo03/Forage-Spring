package sn.isi.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Client {
    private int id;
    @NotNull(message = "Le nom ne doit pas etre null")
    private String nom_complet;
    @NotNull(message = "L'adresse ne doit pas etre null")
    private String adresse;
    @NotNull(message = "Le telephone ne doit pas etre null")
    private int telephone;

}
