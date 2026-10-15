package practice_probolem;
class Locker<T>{
    private T item;

    void put(T item){
        this.item = item;
    }
    T get(){
        return item;
    }
}

public class problem_2 {
    public static void main(String[] args) {
        Locker<String>l1 = new Locker<>();
        l1.put("c++ book");
        System.out.println("the locker has :" + l1.get());

        Locker<Integer>intlockerr = new Locker<>();
        intlockerr.put(1234);
        intlockerr.put(8976);

        System.out.println("Intlocker has : " + intlockerr.get());
    }
}
