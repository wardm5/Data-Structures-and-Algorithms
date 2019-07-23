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
                temp = temp.next;
            }
            temp.next = new Entry<K, V>(key, value);
        } else {
            table[hash % 10] = new Entry<K,V>(key, value);
        }
        this.size++;
    }
    public V get(K key) {
        this.hash = key.hashCode();
        System.out.println(hash);
        System.out.println(table[hash % 10].getValue());
        if (table[hash % 10] != null) {
            System.out.println();
            Entry<K,V> temp = table[hash % 10];

            System.out.println(temp.getValue());
            while (temp.next != null) {
                temp = temp.next;
            }
            return temp.getValue();
        } else {
            return table[hash % 10].getValue();
        }
    }
}
