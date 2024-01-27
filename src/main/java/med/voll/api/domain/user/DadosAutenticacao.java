package med.voll.api.domain.user;

import jakarta.validation.constraints.NotNull;

public record DadosAutenticacao(

        @NotNull
        Long id,
        String user,
        String senha
) {
}
