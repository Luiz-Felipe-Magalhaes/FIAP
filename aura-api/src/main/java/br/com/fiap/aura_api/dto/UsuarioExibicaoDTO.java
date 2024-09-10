package br.com.fiap.aura_api.dto;


import br.com.fiap.aura_api.model.Usuario;

public record UsuarioExibicaoDTO(
        Long usuarioId,
        String nome,
        String email) {

    public UsuarioExibicaoDTO(Usuario usuario) {
        this(
            usuario.getUsuarioId(),
            usuario.getNome(),
            usuario.getEmail());
    }

}
