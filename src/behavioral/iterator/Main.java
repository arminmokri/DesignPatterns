package behavioral.iterator;

import java.util.Arrays;

public class Main {

    public static void println(String x) {
        System.out.println(x);
        System.out.flush();
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
        }
    }

    public static void errPrintln(String x) {
        System.err.println(x);
        System.err.flush();
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
        }
    }

    public static void println() {
        println("");
    }

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
            println(iterator.getNext().toString());
        }
        println();
        Thread.sleep(2000);

        // remove 56.5f
        stations.removeStation(tvStations[1]);

        // print
        iterator = stations.getStationIterator();
        while (iterator.hasMore()) {
            println(iterator.getNext().toString());
        }
        println();
        Thread.sleep(2000);
    }
}
