package br.com.fiap.aura_api.model;

public enum UsuarioRole {
    USER("user");

    private String role;

    UsuarioRole(String role){
        this.role = role;
    }

    public String getRole(){
        return this.role;
    }
}