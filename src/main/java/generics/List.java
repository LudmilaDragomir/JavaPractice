package generics;

import java.util.ArrayList;

public class List extends ArrayList{
    public boolean add(Object o){
        return false;
    }
    public Object get(int i){return new Object();}
    public boolean remove(Object o){
        return false;
    }
    public int size(){return 0;}
    Generic<String, Integer> g = new Generic();

}

class Generic<T1, T2>{

    T1 a;
    T2 b;

}
