package day_50_2308;

// https://leetcode.com/problems/design-underground-system/description/

import java.util.HashMap;
import java.util.Map;

public class UndergroundSystem {
    private final Map<Integer, PassengerInfo> passengers;
    private final Map<String, StationInfo> stations;

    public UndergroundSystem() {
        passengers = new HashMap<>();
        stations = new HashMap<>();
    }

    public void checkIn(int id, String stationName, int t) {
        passengers.put(id, new PassengerInfo(stationName, t));
    }

    public void checkOut(int id, String stationName, int t) {
        var passengerInfo = passengers.get(id);
        var time = t - passengerInfo.time;
        var twoStations = passengerInfo.station + " " + stationName;
        var fromMap =  stations.get(twoStations);
        if (fromMap != null) {
            fromMap.duration += time;
            fromMap.trips++;
            stations.put(twoStations, fromMap);
        } else {
            stations.put(twoStations, new StationInfo(time, 1));
        }
    }

    public double getAverageTime(String startStation, String endStation) {
        var twoStations = stations.get(startStation + " " + endStation);
        return (double)twoStations.duration / twoStations.trips;
    }

    static class PassengerInfo {
        String station;
        int time;

        public PassengerInfo(String station, int time) {
            this.station = station;
            this.time = time;
        }
    }

    static class StationInfo {
        int duration;
        int trips;

        public StationInfo(int duration, int trips) {
            this.duration = duration;
            this.trips = trips;
        }
    }
}
