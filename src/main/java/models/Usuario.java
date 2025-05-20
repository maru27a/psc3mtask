package models;

import jakarta.persistence.nome;
import jakarta.persistence.id;
import jakarta.persistence.email;

@Entity
@Table

public class Usuario {
    @id
    private int id;
    private String nome;
    private String email;

    public Usuario(String senha, String email, String nome, int id) {
        this.senha = senha;
        this.email = email;
        this.nome = nome;
        this.id = id;
    }

    private String senha;

}

