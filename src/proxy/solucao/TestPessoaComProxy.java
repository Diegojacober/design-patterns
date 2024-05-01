package proxy.solucao;

import builder.Person;
import proxy.PessoaRepository;
import proxy.PessoaService;

import java.time.LocalDate;

public class TestPessoaComProxy {
    public static void main(String[] args) {

        NovoPessoaRepositoryProxy novoPessoaRepositoryProxy = new NovoPessoaRepositoryProxy();
        PessoaRepositoryProxy pessoaRepositoryProxy = new PessoaRepositoryProxy();
        PessoaService pessoaService = new PessoaService(novoPessoaRepositoryProxy);


        Person pessoa = new Person.PersonBuilder()
                .sobreNome("Alencar Jacober")
                .dataNascimento(LocalDate.of(2004, 12, 29))
                .nome("Diego")
                .apelido("Diego")
                .documento("12354798")
                .build();

        pessoaService.save(pessoa);

        Person pessoaRetornada = pessoaService.findById(1L);

        System.out.println(pessoaRetornada);


        Person pessoaRetornada2 = pessoaService.findById(1L);

        System.out.println(pessoaRetornada2);

    }
}
