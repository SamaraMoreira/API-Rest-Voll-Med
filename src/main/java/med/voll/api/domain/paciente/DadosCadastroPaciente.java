package med.voll.api.domain.paciente;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import med.voll.api.domain.endereco.DadosEndereco;

public record DadosCadastroPaciente(
        @NotBlank
        String nome,
        @Email
        @NotBlank
        String email,
        @NotBlank
        String telefone,
        @Pattern(regexp = "\\d{11}")
        @NotBlank
        String cpf,
        @Valid
        @NotNull
        DadosEndereco endereco
) {
}
