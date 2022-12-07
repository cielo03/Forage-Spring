package sn.isi.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.validation.constraints.NotNull;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Compteur {
    private int id;
    @NotNull(message = "Le numero de compte ne doit pas etre null")
    private int numero_cpt;
    @NotNull(message = "L'index ne doit pas etre null")
    private int index;







}
