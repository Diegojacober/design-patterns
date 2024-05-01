package proxy.solucao;

import builder.Person;

public interface ProxyPessoa {
    void save(Person pessoa);
    Person findById(Long id) ;
}
