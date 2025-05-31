package benicio.iury.CadastroDeNinjas.Ninjas;

import org.springframework.stereotype.Component;

@Component
public class NinjaMapper {

    //Recebe o ninjaDTO
    public NinjaModel toModel(NinjaDTO ninjaDTO) {
        // cria um objeto do tipo ninjaModel
        NinjaModel ninjaModel = new NinjaModel();

        //SETA AS CARACTERISTICAS DO ninjaModel, baseadas no ninjaDTO
        ninjaModel.setId(ninjaDTO.getId());
        ninjaModel.setNome(ninjaDTO.getNome());
        ninjaModel.setEmail(ninjaDTO.getEmail());
        ninjaModel.setImgUrl(ninjaDTO.getImgUrl());
        ninjaModel.setIdade(ninjaDTO.getIdade());
        ninjaModel.setMissao(ninjaDTO.getMissao());
        ninjaModel.setRank(ninjaDTO.getRank());

        return ninjaModel;
    }


    //Recebe o ninjaModel
    public NinjaDTO toDTO(NinjaModel ninjaModel) {
        // cria um objeto do tipo ninjaDTO
        NinjaDTO ninjaDTO = new NinjaDTO();

        //SETA AS CARACTERISTICAS DO ninjaDTO, baseadas no ninjaModel
        ninjaDTO.setId(ninjaModel.getId());
        ninjaDTO.setNome(ninjaModel.getNome());
        ninjaDTO.setEmail(ninjaModel.getEmail());
        ninjaDTO.setImgUrl(ninjaModel.getImgUrl());
        ninjaDTO.setIdade(ninjaModel.getIdade());
        ninjaDTO.setMissao(ninjaModel.getMissao());
        ninjaDTO.setRank(ninjaModel.getRank());

        return ninjaDTO;
    }


}
