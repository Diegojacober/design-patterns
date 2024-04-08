package builder.solution;

import builder.Person;

import java.time.LocalDate;

public class PersonBuilder {
    private String nome;
    private String sobreNome;
    private String documento;
    private String email;
    private String apelido;
    private LocalDate dataNascimento;

    public PersonBuilder nome(String nome) {
        this.nome = nome;
        return this;
    }

    public PersonBuilder sobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
        return this;
    }

    public PersonBuilder documento(String documento) {
        this.documento = documento;
        return this;
    }

    public PersonBuilder email(String email) {
        this.email = email;
        return this;
    }

    public PersonBuilder apelido(String apelido) {
        this.apelido = apelido;
        return this;
    }

    public PersonBuilder dataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
        return this;
    }

//    public Person builder() {
//        return new Person(nome, sobreNome, documento, email, apelido, dataNascimento);
//    }
}
