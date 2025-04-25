package benicio.iury.CadastroDeNinjas.Ninjas;

import benicio.iury.CadastroDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;

import java.util.List;

@Entity // transforma a classe em entidade
@Table(name = "tb_Ninjas_Cadastrados")
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private int idade;

    //um ninja pode ter apenas uma missão
    @ManyToOne
    @JoinColumn(name = "missoes_id") // Foreing Key - chave estrangeira
    private MissoesModel missao;

    //Constructors
    public NinjaModel() {
    }

    public NinjaModel(String nome, String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }

    //Getters
    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public int getIdade() {
        return idade;
    }

    //Setters
    public void setNome(String nome) {

        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}