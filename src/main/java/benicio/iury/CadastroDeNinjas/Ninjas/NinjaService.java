package benicio.iury.CadastroDeNinjas.Ninjas;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class NinjaService {
    //injeção de dependencias
    private NinjaRepository ninjaRepository;
    private NinjaMapper ninjaMapper;
    //construtor
    public NinjaService(NinjaMapper ninjaMapper, NinjaRepository ninjaRepository) {
        this.ninjaMapper = ninjaMapper;
        this.ninjaRepository = ninjaRepository;
    }

    //Listar todos os ninjas
    public List<NinjaDTO> listarNinjas(){
        List<NinjaModel> ninjas = ninjaRepository.findAll();
        List<NinjaDTO>listaDTO = ninjas.stream()
                .map(ninjaMapper::toDTO)
                .collect(Collectors.toList());
        return listaDTO;
    }

    //Listar Ninjas por ID
    public NinjaDTO listarNinjaPorId(long id){
        Optional<NinjaModel> ninjaPorId = ninjaRepository.findById(id);
        if(ninjaPorId.isPresent()){
            return ninjaMapper.toDTO(ninjaPorId.get());
        }
        return null;
    }

    //Atualizar ninja
    public NinjaDTO atualizarNinja(Long id, NinjaDTO ninjaDTO){
        Optional<NinjaModel> ninjaExistente = ninjaRepository.findById(id);

        if(ninjaExistente.isPresent()){
            NinjaModel ninjaAtualizado = ninjaMapper.toModel(ninjaDTO);
            ninjaAtualizado.setId(id);
            NinjaModel ninjaSalvo = ninjaRepository.save(ninjaAtualizado);
            return ninjaMapper.toDTO(ninjaSalvo);
        }
        return null;
    }

    //Criar um novo ninja
    public NinjaDTO criaUmNovoNinja(NinjaDTO ninjaDTO) {
        // Converte DTO para Model
        NinjaModel ninjaEntity = ninjaMapper.toModel(ninjaDTO);

        // Salva no banco
        ninjaEntity = ninjaRepository.save(ninjaEntity);

        // Converte Model para DTO de volta (com ID e dados atualizados)
        NinjaDTO ninjaConvertido = ninjaMapper.toDTO(ninjaEntity);

        return ninjaConvertido;
    }
}
