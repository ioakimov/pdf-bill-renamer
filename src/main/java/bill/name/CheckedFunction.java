package bill.name;


@FunctionalInterface
public interface CheckedFunction<T, R> {
    R apply(T t) throws Exception;
}
