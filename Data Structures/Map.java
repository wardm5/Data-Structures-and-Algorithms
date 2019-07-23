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
                if (temp.getKey() == key) {
                    System.out.println("checking key");
                    System.out.println(temp.getKey() + "  " + key + "  " + hash % 10);
                    temp.setValue(value);
                    return;
                }
                temp = temp.next;
            }
            System.out.println(temp.getKey() + "  " + key + "  " + hash % 10);
            temp.next = new Entry<K, V>(key, value);
        } else {
            System.out.println("Adding for new value in linked list  " + table[hash % 10] + "  " + key + "  " + hash % 10);
            table[hash % 10] = new Entry<K,V>(key, value);
        }
        this.size++;
    }
    public V get(K key) {
        if (size == 0)
            return null;
        this.hash = key.hashCode();
        // System.out.println("HashCode = " + hash);
        // System.out.println("table value = " + table[hash % 10].getValue());
        if (table[hash % 10] != null) {
            Entry<K,V> temp = table[hash % 10];
            while (temp.next != null) {
                temp = temp.next;
                if (temp.getKey() == key)
                    return temp.getValue();
            }
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
            System.out.println("checking contains method");
            Entry<K, V> temp = table[hash % 10];
            while (temp.next != null) {
                System.out.print(temp.getValue() + "  ");
                temp = temp.next;
                if (temp.getKey() == key) {
                    System.out.print(temp.getValue() + "  ");
                    return true;
                }
            }
            if (temp.getKey() == key) {
                System.out.print("yo " + temp.getValue() + "  ");
                return true;
            }
        }
        System.out.println("end");
        return false;
    }
    // public boolean containsValue(V value) {
    //
    // }
}
