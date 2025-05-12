package benicio.iury.CadastroDeNinjas.Missoes;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("missoes")
public class MissoesController {

    // listar missões
    @GetMapping("/listar")
    public String listarMissoes(){
        return "Listar missões";
    }

    // adiciona missões
    @PostMapping("/criar")
    public String criarMissao(){
        return "Criar missão";
    }

    // Alterar missão
    @PutMapping("/alterar")
    public String alterarMissao(){
        return "Alterar missão";
    }

    // Deletar missão
    @DeleteMapping("/delete")
    public String deletarMissao(){
        return "Deletar missão";
    }
}
