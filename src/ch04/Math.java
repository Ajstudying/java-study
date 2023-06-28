package ch04;

import java.util.ArrayList;
import java.util.List;

public class Math {
    private List<Integer> lst;

    public Math() {
        this.lst = new ArrayList<Integer>();
    }

    public List<Integer> getLst() {
        return lst;
    }

    public void makeLst(int i){
        lst.add(i);
    }
    public int max(Math m){
        int max = m.getLst().get(0);
        for (int i = 0; i <m.getLst().size(); i++){
            if(m.getLst().get(i) > max){
                max = m.getLst().get(i);
            }
        }return max;
    }


    public int min(Math m){
        int min = m.getLst().get(0);
        for (int i = 0; i < m.getLst().size(); i++) {
            if(m.getLst().get(i) < min){
                min = m.getLst().get(i);
            }
        }return min;
    }




}
