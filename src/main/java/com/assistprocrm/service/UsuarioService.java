package com.assistprocrm.service;

import com.assistprocrm.dto.request.UsuarioRequest;
import com.assistprocrm.dto.response.UsuarioResponse;
import com.assistprocrm.entity.Usuario;
import com.assistprocrm.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<UsuarioResponse> findAll() {

        List<Usuario> usuarios = usuarioRepository.findAll();

        List<UsuarioResponse> usuarioResponses = new ArrayList<>();

        for (Usuario usuario : usuarios) {
            usuarioResponses.add(new UsuarioResponse(usuario));
        }

        return usuarioResponses;
    }

    public Optional<UsuarioResponse> findById(Integer id) {

        Optional<Usuario> usuario = usuarioRepository.findById(id);

        return usuario.map(UsuarioResponse::new);
    }

    public UsuarioResponse save(UsuarioRequest usuarioRequest) {

        Usuario usuario = new Usuario(usuarioRequest);

        usuarioRepository.save(usuario);

        return new UsuarioResponse(usuario);
    }

    public UsuarioResponse update(Integer id, UsuarioRequest usuarioRequest) {

        if (!usuarioRepository.existsById(id)) {
            throw new RuntimeException("Usuário não encontrado");
        }

        Usuario usuario = new Usuario(usuarioRequest);

        usuario.setId(id);

        usuarioRepository.save(usuario);

        return new UsuarioResponse(usuario);
    }

    public void delete(Integer id) {

        if (!usuarioRepository.existsById(id)) {
            throw new RuntimeException("Usuário não encontrado");
        }

        usuarioRepository.deleteById(id);
    }
}
