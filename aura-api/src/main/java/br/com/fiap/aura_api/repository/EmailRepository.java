package br.com.fiap.aura_api.repository;

import br.com.fiap.aura_api.model.Email;
import br.com.fiap.aura_api.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmailRepository extends JpaRepository<Email, Long> {

    List<Email> findByDestinatario(Usuario destinatario);

    List<Email> findByRemetente(Usuario remetente);
}