public class entry<K,V> {
    final private K key;
    private V value;
    public entry() {
        key = null;
        value = null;
    }
    public entry(K key, V value) {
        this.key = key;
        this. value = value;
    }
    public K getKey() {
        return key;
    }
    public V getValue() {
        return value;
    }
    public setValue(V value) {
        this.value = value;
    }
}
