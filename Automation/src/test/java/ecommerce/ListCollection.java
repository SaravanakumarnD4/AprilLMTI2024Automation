package ecommerce;

import java.util.ArrayList;
import java.util.List;

public class ListCollection {

    public static void main(String[] args) {


        List<Integer> l = new ArrayList<Integer>();
        l.add(12);
        l.add(23);
        l.add(23);
        l.add(34);

       // System.out.println(l);

        for(Integer i:l){
            System.out.println(i);
        }


    }
}
