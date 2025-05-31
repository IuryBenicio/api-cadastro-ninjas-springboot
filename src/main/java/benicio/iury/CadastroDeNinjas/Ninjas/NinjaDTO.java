package benicio.iury.CadastroDeNinjas.Ninjas;

import benicio.iury.CadastroDeNinjas.Missoes.MissoesModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class NinjaDTO { //abstração da camada model

    private Long id;

    private String nome;

    private String email;

    private int idade;

    private String imgUrl;

    private String rank;

    private MissoesModel missao;
}
