package ProgressJava.Les1_2ArrayList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main1_2ArrayList {
    public static void main(String[] args) {
        List<Integer> intArray = new ArrayList<>(100);

        for(int q = 0; q < 100; q++){
            intArray.add(q);
        }

        intArray.remove(4);

        System.out.println(intArray);
        System.out.println(intArray.get(1));
        System.out.println(intArray.size());

        for(Integer x : intArray) {
            System.out.print(x + " ");
        }

        intArray = new LinkedList<>();//if realisation only of List
    }
}
