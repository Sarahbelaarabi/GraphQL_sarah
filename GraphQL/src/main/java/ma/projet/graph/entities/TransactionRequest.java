package ma.projet.graph.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TransactionRequest {
    private Double montant;
    private Long compteId; // ID of the associated account
    private TypeTransaction type;

}
