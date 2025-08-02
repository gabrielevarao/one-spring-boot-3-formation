package med.voll.api.domain.consulta;

import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotNull;
import med.voll.api.domain.medico.Especialidade;
import med.voll.api.domain.medico.Medico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;

@Repository
public interface ConsultaRepository extends JpaRepository<Consulta, Long> {

    boolean existisByMedicoIdAndData(Long IdMedico, LocalDateTime data);

    boolean existsByPacientIdAndDataBetween(@NotNull Long idPaciente, LocalDateTime primeiroHorario, LocalDateTime ultimoHorario);
}
