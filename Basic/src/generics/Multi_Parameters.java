package generics;
class pairs <k,v>{
    private k key;
    private v value;

    pairs(k key, v value){
        this.key = key;
        this.value = value;
    }

    k getKey(){
        return key;
    }

    v getValue(){
        return value;
    }
}

public class Multi_Parameters {
    public static void main(String[] args) {
        pairs<String,Integer> p = new pairs<>("age", 25);

        String k = p.getKey();
        Integer v = p.getValue();

        System.out.println(k + ":" + v);
    }
}
/*
// Corrected second code
class pairs<K,V> {
    private K key;
    private V value;

    pairs(K key, V value) {
        this.key = key;
        this.value = value;
    }

    K getKey() {
        return key;
    }

    V getValue() {
        return value;
    }
}

public class Multi_Parameters {
    public static void main(String[] args) {
        pairs<String,Integer> p = new pairs<>("age", 22);

        String k = p.getKey();
        Integer v = p.getValue();

        System.out.println(k + ":" + v);
    }
}

*/