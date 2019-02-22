import java.util.function.Function;

@FunctionalInterface
public interface Comparator<T> {

    int Comparator(T t1, T t2);

    static Comparator<Person> comparing(Function<Person,Integer> f) {
        return (p1,p2) -> f.apply(p1) - f.apply(p2);
    }

}
