package day_49_2208;

// https://leetcode.com/problems/design-parking-system/description/

public class ParkingSystem {
    private int[] parkPlaces;

    public ParkingSystem(int big, int medium, int small) {
        parkPlaces = new int[]{big, medium, small};
    }

    public boolean addCar(int carType) {
        if (--parkPlaces[carType - 1] >= 0) {
            return true;
        }
        return false;
    }
}
