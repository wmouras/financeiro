package contabancaria.negocio;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Cliente {

    private Integer id;
    private String nome;
    private String cpf;
    private String telefone;
    private String email;
    private Conta conta;

}
