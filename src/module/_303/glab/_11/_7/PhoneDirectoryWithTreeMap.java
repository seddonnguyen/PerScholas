package module._303.glab._11._7;

import java.util.TreeMap;
import java.util.Map;

public class PhoneDirectoryWithTreeMap {
    private Map<String, String> data;

    public PhoneDirectoryWithTreeMap() {
        this.data = new TreeMap<>();
    }

    public String getNumber(String name) {
        return this.data.get(name);
    }

    public void putNumber(String name, String number) {
        if (name == null || number == null) {
            throw new IllegalArgumentException("Name and number cannot be null");
        }
        this.data.put(name, number);
    }

    public void print() {
        for(Map.Entry<String, String> entry : this.data.entrySet()) {
            System.out.println(STR."\{entry.getKey()} : \{entry.getValue()}");
        }
    }
}
