package med.voll.api.domain.consulta.validacoes;

import med.voll.api.domain.ValidacaoException;
import med.voll.api.domain.consulta.DadosAgendamentoConsulta;
import med.voll.api.repository.ConsultaRepository;

public class ValidarMedicoComOutraConsultaNoMesmoHorario {

    private ConsultaRepository consultaRepository;

    public void validar(DadosAgendamentoConsulta dados) {
        var medicoPossuiOutraConsultaNoMesmoHoraio = consultaRepository.existsByMedicoIdAndData(dados.idMedico(), dados.data());
        if(medicoPossuiOutraConsultaNoMesmoHoraio){
            throw new ValidacaoException("Médico já possui outra consultada agendada nesse mesmo horário");
        }
    }

}

