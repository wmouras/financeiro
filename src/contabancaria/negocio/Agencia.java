package contabancaria.negocio;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Agencia {

    private Integer id;
    private String nome;
    private String numero;
    private String endereco;
    private String telefone;
    private Banco banco;

}
