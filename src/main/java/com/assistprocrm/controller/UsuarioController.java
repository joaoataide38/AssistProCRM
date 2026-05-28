package com.assistprocrm.controller;

import org.springframework.http.ResponseEntity;
import com.assistprocrm.dto.request.UsuarioRequest;
import com.assistprocrm.dto.response.UsuarioResponse;
import com.assistprocrm.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/usuarios")
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;

    @GetMapping
    public ResponseEntity<List<UsuarioResponse>> getAll() {

        try {

            List<UsuarioResponse> usuarios = usuarioService.findAll();

            if (usuarios.isEmpty()) {
                return ResponseEntity.noContent().build();
            }

            return ResponseEntity.ok(usuarios);

        } catch (RuntimeException e) {

            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<UsuarioResponse> getById(@PathVariable Integer id) {

        return usuarioService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<UsuarioResponse> create(@RequestBody UsuarioRequest usuarioRequest) {

        return ResponseEntity.ok(usuarioService.save(usuarioRequest));
    }

    @PutMapping("/{id}")
    public ResponseEntity<UsuarioResponse> update(@PathVariable Integer id,
                                                  @RequestBody UsuarioRequest usuarioRequest) {

        try {

            return ResponseEntity.ok(
                    usuarioService.update(id, usuarioRequest)
            );

        } catch (RuntimeException e) {

            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {

        try {

            usuarioService.delete(id);

            return ResponseEntity.noContent().build();

        } catch (RuntimeException e) {

            return ResponseEntity.notFound().build();
        }
    }
}
