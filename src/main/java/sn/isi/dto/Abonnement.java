package sn.isi.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.validation.constraints.NotNull;


import java.util.Date;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Abonnement {
    private int id;
    @NotNull(message = "La date ne doit pas etre null")
    private Date date;
    @NotNull(message = "Le numero ne doit pas etre null")
    private int numeroAb;
    @NotNull(message = "La description ne doit pas etre null")
    private String description;

}
