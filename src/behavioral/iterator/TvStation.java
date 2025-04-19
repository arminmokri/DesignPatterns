package behavioral.iterator;

public class TvStation implements Comparable<TvStation> {

    enum Type {
        UHF,
        VHF
    }

    private final Type type;
    private final Float frequency;

    public TvStation(Type type, Float frequency) {
        this.type = type;
        this.frequency = frequency;
    }

    @Override
    public int compareTo(TvStation tvStation) {
        return (int) (this.frequency - tvStation.frequency);
    }

    @Override
    public String toString() {
        return "TvStation{" +
                "type=" + type +
                ", frequency=" + frequency +
                '}';
    }
}
