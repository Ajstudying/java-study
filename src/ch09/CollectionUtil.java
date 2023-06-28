package ch09;

import java.util.List;

public class CollectionUtil<T> {

    public int countOccurrences(List<T> lst, T target) {
        int count = 0;
        for(T instance : lst){
            if(instance.equals(target)){
                count++;
            }
        }return count;
    }
}
