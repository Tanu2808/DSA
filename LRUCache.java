import java.util.LinkedHashMap;

public class LRUCache {

    private int capacity;
    private LinkedHashMap<Integer, Integer> map;

    public LRUCache(int capacity) {
        map = new LinkedHashMap<>(capacity, 0.75f, true);
        this.capacity = capacity;
    }

    public int get(int key) {
        if (!map.containsKey(key)) {
            return -1;
        }
        return map.get(key);
    }

    public void put(int key, int value) {
        map.put(key, value);
        if (capacity < map.size()) {
            int lruKey = map.keySet().iterator().next();
            map.remove(lruKey);
        }
    }
}