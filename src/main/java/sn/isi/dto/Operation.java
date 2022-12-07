package sn.isi.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.validation.constraints.NotNull;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Operation {
    private int id;
    @NotNull(message = "Le cumul ne doit pas etre null")
    private int nv_cumul;
    @NotNull(message = "Le prix ne doit pas etre null")
    private int prix_litre;

}
