package generics;

class box<T> {
    private T value;

    void set(T value) {
        this.value = value;
    }

    T get() {
        return value;
    }
}

class gen {
    public static void main(String[] args) {
        box<String> Box = new box<>();

        Box.set("hello");

        String s = Box.get();

        System.out.println(s);
    }
}
/*
1. compile time errors detected. without generics we cant detect
   compile time errors , the code will break while executing (run time)

2. Mo manual casting

3. resuable code. (one box class works for any type).

rules :
1. Mention the wrapper class.
2.java automatically performs autoboxing and unboxing.
 */