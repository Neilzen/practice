package org.example.findintersection;

import java.util.*;
import java.util.stream.Collectors;

public class FindIntersection {

    public static String execute(String[] strArr) {
        // code goes here
        String arrayA = strArr[0];
        String arrayB = strArr[1];

        List<String> listA = new ArrayList<>(Arrays.asList(arrayA.replace(" ", "").split(",")));
        List<String> listB = new ArrayList<>(Arrays.asList(arrayB.replace(" ", "").split(",")));

        List<String> intersections;

        if(listA.size() > listB.size()) {
            intersections = findIntersection(listA, listB);
        } else {
            intersections = findIntersection(listB, listA);
        }

        return generateResponse(intersections);
    }

    private static List<String> findIntersection(List<String> parent, List<String> child) {
        return parent.stream().filter(child::contains).collect(Collectors.toList());
    }

    private static String generateResponse(List<String> intersections) {
        StringBuilder sb = new StringBuilder();
        for(int x = 0; x < intersections.size(); x++) {
            if(x == 0) {
                sb.append(intersections.get(x));
            } else {
                sb.append("," + intersections.get(x));
            }
        }
        return sb.toString();
    }


}
