public class Map<K, V> {
    // to be completed later...
    private int hash;
    private Entry<K, V>[] table = new Entry[10];
    private int size;
    public Map () {
        this.table = new Entry[10];
        this.hash = 0;
        this.size = 0;
    }
    public Map (K key, V value) {
        this.hash = key.hashCode();
        this.table[hash % 10] = new Entry<K, V>(key, value);
        this.size++;
    }
    public void add(K key, V value) {
        this.hash = key.hashCode();
        if (table[hash % 10] != null) {
            Entry temp = table[hash % 10];
            while (temp.next != null) {
                if (temp.getKey().equals(key)) {
                    temp.setValue(value);
                    return;
                }
                temp = temp.next;
            }
            temp.next = new Entry<K, V>(key, value);
        } else {
            table[hash % 10] = new Entry<K,V>(key, value);
        }
        this.size++;
    }
    public V get(K key) {
        if (size == 0)
            return null;
        this.hash = key.hashCode();
        if (table[hash % 10] != null) {
            Entry<K,V> temp = table[hash % 10];
            while (temp.next != null) {
                if (temp.getKey().equals(key))
                    return temp.getValue();
                temp = temp.next;
                if (temp.getKey().equals(key))
                    return temp.getValue();
            }
            if (temp.getKey().equals(key))
                return temp.getValue();
            System.out.println("Your value did not exist");
            return null;
        } else {
            return table[hash % 10].getValue();
        }
    }
    public boolean containsKey(K key) {
        if (size == 0)
            return false;
        this.hash = key.hashCode();
        if (table[hash % 10] != null) {
            Entry<K, V> temp = table[hash % 10];
            while (temp.next != null) {
                if (temp.getKey().equals(key)) {
                    return true;
                }
                temp = temp.next;
            }
            if (temp.getKey().equals(key)) {
                return true;
            }
        }
        return false;
    }
    // public boolean containsValue(V value) {
    //
    // }
}
