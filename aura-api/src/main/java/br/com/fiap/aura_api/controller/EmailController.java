package br.com.fiap.aura_api.controller;

import br.com.fiap.aura_api.dto.EmailDTO;
import br.com.fiap.aura_api.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/email")
public class EmailController {

    @Autowired
    private EmailService emailService;

    @PostMapping("/enviar")
    @ResponseStatus(HttpStatus.CREATED)
    public EmailDTO enviarEmail(@RequestBody EmailDTO email){
        return emailService.enviarEmail(email);
    }

/*    @GetMapping("/recebidos")
    public List<EmailDTO> listarEmailsRecebidos() {
        return emailService.listarEmailsRecebidos();
    }

    @GetMapping("/enviados")
    public List<EmailDTO> listarEmailsEnviados() {
        return emailService.listarEmailsEnviados();
    }*/
}