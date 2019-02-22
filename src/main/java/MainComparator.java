import java.util.function.Function;

public class MainComparator {

    public static void main(String[] args) {

        //Comparator<Person> compPerson = (P1, P2) -> -1;

        Comparator<Person> compAge = (p1,p2) -> p2.getAge() - p1.getAge();
        Comparator<Person> firstName = (p1,p2) -> p1.getFirstName().compareTo(p2.getFirstName());
        Comparator<Person> lastName = (p1,p2) -> p1.getLastName().compareTo(p2.getLastName());

        Function<Person, Integer> f1 = p -> p.getAge();
        Function<Person, String> f2 = p -> p.getFirstName();
        Function<Person, String> f3 = p -> p.getLastName();

        Comparator<Person> compPerson = Comparator.comparing(f1);





    }
}
