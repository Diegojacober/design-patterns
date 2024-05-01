package proxy;

import builder.Person;
import proxy.solucao.PessoaRepositoryProxy;
import proxy.solucao.ProxyPessoa;

public class PessoaService {
    private ProxyPessoa pessoaRepository;

    public PessoaService(ProxyPessoa pessoaRepository) {
        this.pessoaRepository = pessoaRepository;
    }

    public void save(Person pessoa) {
        pessoaRepository.save(pessoa);
    }

    public Person findById(Long id) {
        return pessoaRepository.findById(id);
    }
}
