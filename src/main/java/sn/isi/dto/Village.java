package sn.isi.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Village {
    private int id;
    @NotNull(message = "Le nom du chef ne doit pas etre null")
    private String chef_village;
    @NotNull(message = "Le nom du village ne doit pas etre null")
     private String nom_village;


}
