package benicio.iury.CadastroDeNinjas.Ninjas;

import benicio.iury.CadastroDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity // transforma a classe em entidade
@Table(name = "tb_Ninjas_Cadastrados")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class NinjaModel {

    /*VARIAVEIS DA ENTIDADE*/
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;

    //valor único, não pode ter valores repetidos
    @Column(unique = true)
    private String email;
    private int idade;

    //um ninja pode ter apenas uma missão
    @ManyToOne
    @JoinColumn(name = "missoes_id") // Foreing Key - chave estrangeira
    private MissoesModel missao;

}