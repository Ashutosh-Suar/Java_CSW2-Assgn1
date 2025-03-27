package Assgn2_two;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

class Address {
    private int plotNo;
    private String at;
    private String post;

    public Address(int plotNo, String at, String post) {
        this.plotNo = plotNo;
        this.at = at;
        this.post = post;
    }

    @Override
    public String toString() {
        return "Plot No: " + plotNo + ", At: " + at + ", Post: " + post;
    }
}

public class Q7 {

    public static void main(String[] args) {

        TreeMap<String, Address> addressMap = new TreeMap<>();

        // Adding key-value pairs to the TreeMap
        addressMap.put("John", new Address(101, "Green Street", "New York"));
        addressMap.put("Alice", new Address(202, "Main Road", "Los Angeles"));
        addressMap.put("Bob", new Address(303, "Elm Avenue", "Chicago"));

        // Using Iterator to display entries
        System.out.println("TreeMap Entries:");
        Iterator<Map.Entry<String, Address>> iterator = addressMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Address> entry = iterator.next();
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

    }
}
