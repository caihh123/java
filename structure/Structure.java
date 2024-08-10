public class Structure {

    public static void main(String[] args) {
        // array();
        // arrayList();
        // linkedList();
        // set();
        // treeSet();
        // arrayQueue();
        // hashMap();
        treeMap();
    }

    public static void treeMap() {
        java.util.ArrayList<Integer> list = new java.util.ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        java.util.Collections.sort(list);
        java.util.TreeMap<Integer, Integer> map = new java.util.TreeMap<>();
        list.forEach(i -> map.put(list.indexOf(i), i));
        System.out.println("Size: " + map.size());
        for (Integer k : map.keySet()) {
            System.out.println(k + " = " + map.get(k));
        }
    }

    public static void hashMap() {
        java.util.Map<Integer, Integer> map = new java.util.HashMap<>();
        for (int i = 0; i < 10; i++) {
            map.put(i, i + 1);
        }
        System.out.println("Size: " + map.size());
        for (Integer k : map.keySet()) {
            System.out.println(k + " = " + map.get(k));
        }
    }

    public static void arrayQueue() {
        java.util.ArrayDeque<Integer> queue = new java.util.ArrayDeque<>();
        for (int i = 0; i < 10; i++) {
            queue.add(i + 1);
        }
        System.out.println("Size: " + queue.size());
        while (!queue.isEmpty()) {
            System.out.println(queue.removeFirst());
        }
    }

    public static void treeSet() {
        java.util.ArrayList<Integer> list = new java.util.ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        java.util.Collections.sort(list);
        java.util.TreeSet<Integer> set = new java.util.TreeSet<>(list);
        System.out.println("Size: " + set.size());
        for (Integer k : set) {
            System.out.println(k);
        }
    }

    public static void set() {
        java.util.Set<Integer> set = new java.util.HashSet<>();
        for (int i = 0; i < 10; i++) {
            set.add((i + 1) * 10);
        }

        System.out.println("Size: " + set.size());
        for (Integer k : set) {
            System.out.println(k);
        }
    }

    public static void array() {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(i + " = " + array[i]);
        }
    }

    public static void arrayList() {
        java.util.ArrayList<Integer> array = new java.util.ArrayList<>();
        for (int i = 0; i < 10; i++) {
            array.add(i + 1);
        }
        for (int i = 0; i < array.size(); i++) {
            System.out.println(i + " = " + array.get(i));
        }
    }

    public static void linkedList() {
        java.util.LinkedList<Integer> array = new java.util.LinkedList<>();
        for (int i = 0; i < 10; i++) {
            array.add(i + 1);
        }
        System.out.println(array);
    }
}
