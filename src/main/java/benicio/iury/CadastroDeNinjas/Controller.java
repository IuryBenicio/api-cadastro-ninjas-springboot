package benicio.iury.CadastroDeNinjas;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class Controller {

    @GetMapping("/boasvindas")
    public String boasVindas(){
        return "Essa é a minha primeira mensagem";
    }

    //adicionar ninja

    @PostMapping("/criar")
    public String criarNinja(){
        return "ninja criado";
    }

    //procurar ninja por id

    @GetMapping("/all")
    public String mostrarNinjas(){
        return "mostrar todos os ninjas";
    }

    //alterar dados dos ninjas
    @PutMapping("/alterarID")
    public String alterarNinja(){
        return "Alterar ninja";
    }

    //deletar ninjas
    @DeleteMapping("/deletarID")
    public String deletarNinja(){
        return "Deletar Ninja";
    }
}
