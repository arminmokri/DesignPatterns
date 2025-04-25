package behavioral.iterator;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        // VHF 54 to 216 MHz
        // UHF  470 and 608 MHz

        TvStation[] tvStations = {
                new TvStation(TvStation.Type.UHF, 480f),
                new TvStation(TvStation.Type.VHF, 56.5f),
                new TvStation(TvStation.Type.UHF, 490f),
                new TvStation(TvStation.Type.VHF, 100f),
        };

        // add all items
        Stations stations = new Stations();
        Arrays.stream(tvStations).forEach(stations::addStation);

        // print
        Iterator<TvStation> iterator = stations.getStationIterator();
        while (iterator.hasMore()) {
            System.out.println(iterator.getNext().toString());
        }
        System.out.println();
        Thread.sleep(2000);

        // remove 56.5f
        stations.removeStation(tvStations[1]);

        // print
        iterator = stations.getStationIterator();
        while (iterator.hasMore()) {
            System.out.println(iterator.getNext().toString());
        }
        System.out.println();
        Thread.sleep(2000);
    }
}
