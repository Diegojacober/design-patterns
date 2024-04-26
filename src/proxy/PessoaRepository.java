package proxy;

import builder.Person;

import java.util.HashMap;
import java.util.Map;

public class PessoaRepository {
    private Map<Long, Person> banco = new HashMap<>();
    private static Long countId = 1L;
    public void save(Person pessoa) {
        banco.put(countId++, pessoa);
    }
    public Person findById(Long id) {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return banco.get(id);
    }
}
