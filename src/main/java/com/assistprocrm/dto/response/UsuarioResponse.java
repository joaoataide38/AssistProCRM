package com.assistprocrm.dto.response;

import com.assistprocrm.entity.Usuario;
import com.assistprocrm.enums.Papel;

import java.time.LocalDateTime;

public class UsuarioResponse {
    private Integer id;
    private String nome;
    private String email;
    private String telefone;
    private Papel papel;
    private Boolean ativo;
    private LocalDateTime dataCadastro;

    public UsuarioResponse() {
    }

    public UsuarioResponse(Integer id, String nome,
                              String email, String telefone,
                              Papel papel, Boolean ativo,
                              LocalDateTime dataCadastro) {

        this.id = id;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.papel = papel;
        this.ativo = ativo;
        this.dataCadastro = dataCadastro;
    }

    public UsuarioResponse(Usuario usuario) {

        this.id = usuario.getId();
        this.nome = usuario.getNome();
        this.email = usuario.getEmail();
        this.telefone = usuario.getTelefone();
        this.papel = usuario.getPapel();
        this.ativo = usuario.getAtivo();
        this.dataCadastro = usuario.getDataCadastro();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    public LocalDateTime getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDateTime dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
}
