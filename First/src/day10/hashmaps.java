package First.src.day10;

import java.util.HashMap;
import java.util.*;

public class hashmaps {

    public static void main(String[] args) {
//        String name = "man";
//        int code = name.hashCode();
//        System.out.println(code);

        HashMap<String, Integer> map = new HashMap<>();
        map.put("mohan" , 99);
        map.put("ram", 80);
        map.put("siva",34);
        System.out.println(map.get("mohan"));
        System.out.println(map.containsKey("mohan"));

        HashSet<Integer> set = new HashSet<>();
        set.add(10);
        set.add(250);
        set.add(30);
        System.out.println(set);

    }
}
