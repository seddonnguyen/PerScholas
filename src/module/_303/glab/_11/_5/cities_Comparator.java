package module._303.glab._11._5;

import java.util.Comparator;

public class cities_Comparator implements Comparator<String> {
    @Override
    public int compare(String city1, String city2) {
        int value = city1.compareTo(city2);
        if (value > 0) {
            return -1;
        } else if (value < 0) {
            return 1;
        } else {
            return 0;
        }
    }
}
