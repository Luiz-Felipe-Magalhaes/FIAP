package br.com.fiap.aura_api.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "TBL_EVENTO")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Evento {

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
    private Long eventoId;

    @Column(name = "nomeEvento")
    private String nomeEvento;

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "dataHoraEvento")
    private String dataHora;
}
