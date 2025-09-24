package JonathanLange.CadastroDeNinjas.Ninjas;

import JonathanLange.CadastroDeNinjas.Missoes.MissoesModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NinjaDTO {


    private Long id;
    private String nome;
    private int idade;
    private String imgUrl;
    private String email;
    private String rank;
    private MissoesModel missoes;


}
