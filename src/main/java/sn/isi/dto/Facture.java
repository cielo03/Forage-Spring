package sn.isi.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.validation.constraints.NotNull;
import java.util.Date;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Facture {
    private int id;
    @NotNull(message = "La consommation ne doit pas etre null")
    private int conso_mensuelle;
    @NotNull(message = "Le montant ne doit pas etre null")
    private int montant;
    @NotNull(message = "La date ne doit pas etre null")
    private Date date_fac;
    @NotNull(message = "L'état ne doit pas etre null")
    private int etat;

}
