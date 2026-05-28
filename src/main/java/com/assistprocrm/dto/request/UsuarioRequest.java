package com.assistprocrm.dto.request;

import com.assistprocrm.enums.Papel;

public class UsuarioRequest {
    private String nome;
    private String email;
    private String senha;
    private String telefone;
    private Papel papel;

    public UsuarioRequest() {
    }

    public  UsuarioRequest(String nome, String email,
                             String senha, String telefone,
                             Papel papel) {

        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.telefone = telefone;
        this.papel = papel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Papel getPapel() {
        return papel;
    }

    public void setPapel(Papel papel) {
        this.papel = papel;
    }
}
