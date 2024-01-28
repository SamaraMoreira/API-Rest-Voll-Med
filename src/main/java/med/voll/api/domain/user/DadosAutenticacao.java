package med.voll.api.domain.user;

import jakarta.validation.constraints.NotNull;

public record DadosAutenticacao(
        String login,
        String senha
) {
}
