package Assgn2_two;

class Pair<K, V> {
    private K key;
    private V value;

    // Parameterized Constructor
    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    // Getter for key
    public K getKey() {
        return key;
    }

    // Setter for key
    public void setKey(K key) {
        this.key = key;
    }

    // Getter for value
    public V getValue() {
        return value;
    }

    // Setter for value
    public void setValue(V value) {
        this.value = value;
    }
}

public class Q1 {

    public static void main(String[] args) {

        // Creating objects of Pair class
        Pair<Integer, String> pair1 = new Pair<>(1, "One");
        Pair<String, Double> pair2 = new Pair<>("Pi", 3.14159);
        Pair<Character, Boolean> pair3 = new Pair<>('A', true);

        // Retrieving and printing key-value pairs
        System.out.println("Pair1: Key = " + pair1.getKey() + ", Value = " + pair1.getValue());
        System.out.println("Pair2: Key = " + pair2.getKey() + ", Value = " + pair2.getValue());
        System.out.println("Pair3: Key = " + pair3.getKey() + ", Value = " + pair3.getValue());

    }
}