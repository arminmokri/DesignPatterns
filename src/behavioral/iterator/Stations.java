package behavioral.iterator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Stations {

    private final List<TvStation> stations;

    public Stations() {
        stations = new ArrayList<>();
    }

    public void addStation(TvStation tvStation) {
        stations.add(tvStation);
        Collections.sort(stations);
    }

    public void removeStation(TvStation tvStation) {
        stations.remove(tvStation);
        Collections.sort(stations);
    }

    public Integer numberOfStations() {
        return stations.size();
    }

    public Iterator<TvStation> getStationIterator() {
        return new StationIterator();
    }

    private class StationIterator implements Iterator<TvStation> {

        private Integer pointer;

        public StationIterator() {
            this.pointer = 0;
        }

        @Override
        public TvStation getNext() {
            return stations.get(this.pointer++);
        }

        @Override
        public boolean hasMore() {
            return this.pointer < stations.size();
        }
    }

}
