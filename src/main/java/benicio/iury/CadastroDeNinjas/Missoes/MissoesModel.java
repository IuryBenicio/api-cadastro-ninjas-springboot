package benicio.iury.CadastroDeNinjas.Missoes;

import benicio.iury.CadastroDeNinjas.Ninjas.NinjaModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_missoes")
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String descricao;
    private DificuldadesMissoes dificuldade;

    //uma missão pode ter vários ninjas
    @OneToMany(mappedBy = "missao")
    private List<NinjaModel> ninjas;

    //construtores
    public MissoesModel() {
    }

    public MissoesModel(Long id, String titulo, String descricao, DificuldadesMissoes dificuldade) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.dificuldade = dificuldade;
    }

    //getters

    public Long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public DificuldadesMissoes getDificuldade() {
        return dificuldade;
    }

    //setters

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setDificuldade(DificuldadesMissoes dificuldade) {
        this.dificuldade = dificuldade;
    }
}
