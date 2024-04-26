package proxy.solucao;

import builder.Person;
import proxy.PessoaRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.logging.Logger;

public class PessoaRepositoryProxy extends PessoaRepository implements ProxyPessoa {
    //temos que adicionar um log sem mexer no repository diretamente
    private static Logger log = Logger.getLogger(PessoaRepositoryProxy.class.getName());

    private Map<Long, Person> cache = new HashMap<>();

    @Override
    public void save(Person person) {
        log.info("Iniciando chamado do metodo save..");
        super.save(person);
        log.info("finalizando chamado do metodo save..");
    }

    @Override
    public Person findById(Long id) {
        log.info("Iniciando chamada do metodo findById..");
        Person pessoa = null;
        long inicio = System.currentTimeMillis();
        if (Objects.nonNull(cache.get(id))) {
            log.info("Pegando dados em cache.");
            pessoa = cache.get(id);
        } else {
            pessoa = super.findById(id);
            cache.put(id, pessoa);
        }
        log.info("chamada do metodo findById finalizado.");
        long fim = System.currentTimeMillis();
        log.info("Tempo gasto na chamada..." + (fim - inicio));
        return pessoa;
    }
}
