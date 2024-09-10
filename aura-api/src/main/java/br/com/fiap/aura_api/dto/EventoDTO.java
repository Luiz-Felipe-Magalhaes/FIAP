package br.com.fiap.aura_api.dto;

import br.com.fiap.aura_api.model.Evento;

public record EventoDTO (
        Long eventoId,
        String nomeEvento,
        String descricao,
        String dataHoraEvento
) {
    public EventoDTO(Evento evento) {
        this(
            evento.getEventoId(),
            evento.getNomeEvento(),
            evento.getDescricao(),
            evento.getDataHora()
        );
    }
}
