package benicio.iury.CadastroDeNinjas.Ninjas;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NinjaService {
    private NinjaRepository ninjaRespository;
    //construtor
    public NinjaService(NinjaRepository ninjaRespository) {
        this.ninjaRespository = ninjaRespository;
    }

    //Listar todos os ninjas
    public List<NinjaModel> listarNinjas(){
        return ninjaRespository.findAll();
    }

    //Listar Ninjas por ID
    public NinjaModel listarNinjaPorId(long id){
        Optional<NinjaModel> ninjaPorId = ninjaRespository.findById(id);
        return ninjaPorId.orElse(null);
    }

    //Criar um novo ninja
    public NinjaModel CriarUmNovoNinja(NinjaModel ninja){
        return ninjaRespository.save(ninja);
    }
}
