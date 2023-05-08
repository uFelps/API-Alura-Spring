package med.voll.api.entities;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import med.voll.api.dto.DadosEndereco;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Endereco {

    private String logradouro;
    private String bairro;
    private String cep;
    private String numero;
    private String complemento;
    private String cidade;
    private String uf;

    public Endereco(DadosEndereco endereco) {
        logradouro = endereco.logradouro();
        bairro = endereco.bairro();
        cep = endereco.cep();
        numero = endereco.numero();
        complemento = endereco.complemento();
        cidade = endereco.cidade();
        uf = endereco.uf();
    }

    public void atualizarInformacoes(DadosEndereco endereco) {

        if(endereco.logradouro() != null){
            this.logradouro = endereco.logradouro();
        }

        if(endereco.bairro() != null){
            this.bairro = endereco.bairro();
        }
        if(endereco.cep() != null){
            this.cep = endereco.cep();
        }
        if(endereco.numero() != null){
            this.numero = endereco.numero();
        }
        if(endereco.complemento() != null){
            this.complemento = endereco.complemento();
        }
        if(endereco.cidade() != null){
            this.cidade = endereco.cidade();
        }
        if(endereco.uf() != null){
            this.uf = endereco.uf();
        }


    }
}
