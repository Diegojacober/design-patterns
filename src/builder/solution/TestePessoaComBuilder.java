package builder.solution;

import builder.Person;

import java.time.LocalDate;

public class TestePessoaComBuilder {
    public static void main(String[] args) {
        Person pessoa = new Person.PersonBuilder().nome("Diego")
                .sobreNome("Alencar")
                .documento("4577544")
                .email("diegoalencar.jacober@gmail.com")
                .apelido("diego")
                .dataNascimento(LocalDate.of(2004, 12, 29))
                .build();

        System.out.println(pessoa);
    }
}
