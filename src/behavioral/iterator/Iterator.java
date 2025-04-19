package behavioral.iterator;

public interface Iterator<T> {
    T getNext();

    boolean hasMore();
}
