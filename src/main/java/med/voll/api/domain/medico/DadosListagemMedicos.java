package med.voll.api.domain.medico;

public record DadosListagemMedicos(Long id, String nome, String crm, String email, Especialidade especialidade) {

    public DadosListagemMedicos(Medico medico) {
        this(medico.getId(),medico.getNome(), medico.getEmail(), medico.getCrm(), medico.getEspecialidade());
    }
}

