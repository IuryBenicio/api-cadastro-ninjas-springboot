package benicio.iury.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("ninjas")
public class NinjaController {
    //dependencias
    private NinjaService ninjaService;
    public NinjaController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }



    //adicionar ninja
    @PostMapping("/criar")
    public NinjaModel criarNinja(@RequestBody NinjaModel ninjaModel){
        return ninjaService.CriarUmNovoNinja(ninjaModel);
    }

    //procurar ninja por id
    @GetMapping("/listar")
    public List<NinjaModel> listarNinjas(){
        return ninjaService.listarNinjas();
    }

    //Mostrar ninja por ID
    @GetMapping("/ninja/{id}")
    public NinjaModel listarNinjaForID(@PathVariable long id){
        return ninjaService.listarNinjaPorId(id);
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
