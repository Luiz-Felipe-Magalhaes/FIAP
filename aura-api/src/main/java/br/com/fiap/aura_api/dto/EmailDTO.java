// EmailDTO.java
package br.com.fiap.aura_api.dto;

import br.com.fiap.aura_api.model.Email;

import java.util.Date;

public record EmailDTO (
        String emailId,
        String remetente,
        String destinatario,
        String assunto,
        String mensagem,
        Date dataHoraEnvio
) {
    public EmailDTO(Email email) {
        this(
                email.getEmailId().toString(),
                email.getRemetente().getEmail(),
                email.getDestinatario().getEmail(),
                email.getAssunto(),
                email.getMensagem(),
                email.getDataHoraEnvio()
        );
    }
}