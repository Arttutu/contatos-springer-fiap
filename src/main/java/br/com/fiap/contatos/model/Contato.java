package br.com.fiap.contatos.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Objects;
@Entity
@Table (name = "tbl_contatos")
public class Contato {
    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "CONTATOS_SEQ"
    )
    @SequenceGenerator(
            name = "CONTATOS_SEQ",
            sequenceName = "CONATOS_SEQ",
            allocationSize = 1
    )
    private  long id;
    private String nome;
    private  String email;

    @Column(name = "data__nascimento")
    private LocalDate dataNascimento;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contato contato = (Contato) o;
        return id == contato.id && Objects.equals(nome, contato.nome) && Objects.equals(email, contato.email) && Objects.equals(dataNascimento, contato.dataNascimento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, email, dataNascimento);
    }
}
