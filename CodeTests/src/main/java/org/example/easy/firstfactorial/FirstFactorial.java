package org.example.easy.firstfactorial;

import lombok.extern.slf4j.Slf4j;

public class FirstFactorial {

    public static int execute(int num) {

        // code goes here
        int factor = 1;
        if(num > 0) {
            for(int x = num; x > 0; x--) {
                factor = x * factor;
            }
        }

        return factor;
    }

}
