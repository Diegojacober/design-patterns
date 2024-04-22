package singleton.solucao;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class TestAgendaComSingleton {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
       /* AgendaSingletonEAGER agenda1 = AgendaSingletonEAGER.getInstance();
        AgendaSingletonEAGER agenda2 = AgendaSingletonEAGER.getInstance();

        System.out.println(agenda1);
        System.out.println(agenda2);

        reservaDiaEager("Sexta");
        reservaDiaEager("Sabado");*/

        /*AgendaSingletonLAZY agenda1 = AgendaSingletonLAZY.getInstance();
        AgendaSingletonLAZY agenda2 = AgendaSingletonLAZY.getInstance();

        System.out.println(agenda1);
        System.out.println(agenda2);

        reservaDiaLazy("Sexta");
        reservaDiaLazy("Sabado");
        */

        // reflection
        /*Constructor<AgendaSingletonLAZY> construtorTravesso = AgendaSingletonLAZY.class.getDeclaredConstructor();
        construtorTravesso.setAccessible(true);
        AgendaSingletonLAZY agendaTravessa1 = construtorTravesso.newInstance();
        AgendaSingletonLAZY agendaTravessa2 = construtorTravesso.newInstance();

        System.out.println(agendaTravessa1);
        System.out.println(agendaTravessa2);*/




        AgendaSingletonENUM agenda1 = AgendaSingletonENUM.getInstance();
        AgendaSingletonENUM agenda2 = AgendaSingletonENUM.getInstance();

        System.out.println(agenda1.hashCode());
        System.out.println(agenda2.hashCode());

        // reflection
        /*Constructor<AgendaSingletonENUM> construtorTravesso = AgendaSingletonENUM.class.getDeclaredConstructor();
        construtorTravesso.setAccessible(true);
        AgendaSingletonENUM agendaTravessa1 = construtorTravesso.newInstance();
        AgendaSingletonENUM agendaTravessa2 = construtorTravesso.newInstance();

        System.out.println(agendaTravessa1);
        System.out.println(agendaTravessa2);
        */

        reservaDiaEnum("Sexta");
        reservaDiaEnum("Sabado");

    }

    public static void reservaDiaEager(String dia) {
        AgendaSingletonEAGER agenda = AgendaSingletonEAGER.getInstance();
        agenda.ocupa(dia);
        System.out.println(agenda.getDias());
    }

    public static void reservaDiaLazy(String dia) {
        AgendaSingletonEAGER agenda = AgendaSingletonEAGER.getInstance();
        agenda.ocupa(dia);
        System.out.println(agenda.getDias());
    }

    public static void reservaDiaEnum(String dia) {
        AgendaSingletonENUM agenda = AgendaSingletonENUM.getInstance();
        agenda.ocupa(dia);
        System.out.println(agenda.getDias());
    }
}
