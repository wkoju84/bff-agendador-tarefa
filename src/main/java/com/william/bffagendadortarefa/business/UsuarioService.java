package com.william.bffagendadortarefa.business;

import com.william.bffagendadortarefa.business.dtos.in.EnderecoDTORequest;
import com.william.bffagendadortarefa.business.dtos.in.LoginRequestDTO;
import com.william.bffagendadortarefa.business.dtos.in.TelefoneDTORequest;
import com.william.bffagendadortarefa.business.dtos.in.UsuarioDTORequest;
import com.william.bffagendadortarefa.business.dtos.out.EnderecoDTOResponse;
import com.william.bffagendadortarefa.business.dtos.out.TelefoneDTOResponse;
import com.william.bffagendadortarefa.business.dtos.out.UsuarioDTOResponse;
import com.william.bffagendadortarefa.infrastructure.client.UsuarioClient;
import org.springframework.stereotype.Service;

@Service

public class UsuarioService {

    private final UsuarioClient client;

    public UsuarioService(UsuarioClient client) {
        this.client = client;
    }


    public UsuarioDTOResponse salvaUsuario(UsuarioDTORequest usuarioDTO){
        return client.salvaUsuario(usuarioDTO);
    }

    public String loginUsuario(LoginRequestDTO usuarioDTO){
        return client.login(usuarioDTO);
    }

    public UsuarioDTOResponse buscarUsuarioPorEmail(String email, String token){
        return client.buscaUsuarioPorEmail(email, token);
    }

    public void deletaUsuarioPorEmail(String email, String token){
        client.deletaUsuarioPorEmail(email, token);
    }

    public UsuarioDTOResponse atualizaDadosUsuario(String token, UsuarioDTORequest dto){
        return client.atualizaDadosUsuario(dto, token);
    }

    public EnderecoDTOResponse atualizaEndereco(Long idEndereco, EnderecoDTORequest enderecoDTO, String token){

        return client.atualizaEndereco( enderecoDTO, idEndereco, token);

    }

    public TelefoneDTOResponse atualizaTelefone(Long idTelefone, TelefoneDTORequest dto, String token){

       return client.atualizaTelefone(dto, idTelefone, token);
    }

    public EnderecoDTOResponse cadastraEndereco(String token, EnderecoDTORequest dto){

       return client.cadastraEndereco(dto, token);
    }

    public TelefoneDTOResponse cadastraTelefone(String token, TelefoneDTORequest dto){

        return client.cadastraTelefone(dto, token);
    }
}
