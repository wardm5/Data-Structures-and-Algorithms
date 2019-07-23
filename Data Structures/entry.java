public class Entry<K,V> {
    final private K key;
    private V value;
    public Entry<K,V> next;
    public Entry() {
        key = null;
        value = null;
        this.next = null;
    }
    public Entry(K key, V value) {
        this.key = key;
        this. value = value;
        this.next = null;
    }
    public K getKey() {
        return key;
    }
    public V getValue() {
        return value;
    }
    public void setValue(V value) {
        this.value = value;
    }
}
