package org.example.medium.treeconstructor;

import java.util.*;
import java.util.regex.Pattern;

public class TreeConstructor {

    public static String execute(String[] strArr) {
        // code goes here
        Map<String, List<String>> parentMap = new HashMap<>();
        Set<String> mappedChild = new HashSet<>();

        for(String element: strArr) {
            String parsed = Pattern.compile("[()\s]").matcher(element).replaceAll("");
            String[] array = parsed.split(",");

            String child = array[0];
            String parent = array[1];

            if(parentMap.containsKey(parent)) {
                if(parentMap.get(parent).size() == 2) {
                    return "false";
                }
                parentMap.get(parent).add(child);
            } else {
                if(mappedChild.contains(child)) {
                    return "false";
                }
                List<String> list = new ArrayList<>();
                list.add(child);
                parentMap.put(parent, list);
                mappedChild.add(child);
            }
        }


        return "true";
    }


}
