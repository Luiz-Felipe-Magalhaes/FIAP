package br.com.fiap.aura_api.repository;

import br.com.fiap.aura_api.model.Evento;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EventoRepository extends JpaRepository<Evento, Long> {
}
