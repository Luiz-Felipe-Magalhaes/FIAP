// Email.java
package br.com.fiap.aura_api.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "TBL_EMAIL")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Email {

    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "SEQ_EMAIL"
    )
    @SequenceGenerator(
            name = "SEQ_EMAIL",
            sequenceName = "SEQ_EMAIL",
            allocationSize = 1
    )
    private Long emailId;

    @ManyToOne
    @JoinColumn(name = "remetente", referencedColumnName = "email")
    private Usuario remetente;

    @ManyToOne
    @JoinColumn(name = "destinatario", referencedColumnName = "email")
    private Usuario destinatario;

    @Column(name = "assunto")
    private String assunto;

    @Column(name = "mensagem")
    private String mensagem;

    @Column(name = "dataHoraEnvio")
    private Date dataHoraEnvio;
}