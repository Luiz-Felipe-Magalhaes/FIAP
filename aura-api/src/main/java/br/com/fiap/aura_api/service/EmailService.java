package br.com.fiap.aura_api.service;

import br.com.fiap.aura_api.dto.EmailDTO;
import br.com.fiap.aura_api.model.Email;
import br.com.fiap.aura_api.model.Usuario;
import br.com.fiap.aura_api.repository.EmailRepository;
import br.com.fiap.aura_api.repository.UsuarioRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmailService {

    @Autowired
    private EmailRepository emailRepository;

    @Autowired
    private UsuarioRepository usuarioRepository;

    public EmailDTO enviarEmail(EmailDTO emailDTO) {
        String emailUsuario = SecurityContextHolder.getContext().getAuthentication().getName();
        Usuario remetente = usuarioRepository.findByEmail(emailUsuario);
        Usuario destinatario = usuarioRepository.findByEmail(emailDTO.destinatario());

        if (remetente == null || destinatario == null) {
            throw new RuntimeException("Remetente ou destinatario não encontrado");
        }

        Email email = new Email();
        BeanUtils.copyProperties(emailDTO, email);
        email.setRemetente(remetente);
        email.setDestinatario(destinatario);

        Email emailEnviado = emailRepository.save(email);

        return new EmailDTO(emailEnviado);
    }
}