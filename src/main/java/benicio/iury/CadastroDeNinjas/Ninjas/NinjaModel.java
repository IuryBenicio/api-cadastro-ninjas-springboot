package benicio.iury.CadastroDeNinjas.Ninjas;

import benicio.iury.CadastroDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity // transforma a classe em entidade
@Table(name = "tb_ninjas_cadastrados")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class NinjaModel {

    /*VARIAVEIS DA ENTIDADE*/
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "_id")
    private Long id;


    @Column(name = "nome")
    private String nome;

    //valor único, não pode ter valores repetidos
    @Column(unique = true)
    private String email;


    @Column(name = "idade")
    private int idade;

    //altera o nome da coluna no banco de dados
    @Column(name = "img_url")
    private String imgUrl;

    @Column(name = "rank")
    private String rank;


    //um ninja pode ter apenas uma missão
    @ManyToOne
    @JoinColumn(name = "missoes_id") // Foreing Key - chave estrangeira
    private MissoesModel missao;

}