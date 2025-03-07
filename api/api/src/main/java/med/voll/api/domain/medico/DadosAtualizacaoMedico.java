package med.voll.api.domain.medico;

import jakarta.validation.constraints.NotNull;
import med.voll.api.domain.endereco.DadosEndereco;

public record DadosAtualizacaoMedico(@NotNull Long Id, String nome, String telefone, DadosEndereco endereco) {
}
