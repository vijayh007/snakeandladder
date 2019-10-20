package com.dyanbhandar.snl;

import java.util.Random;

/**
 * Created by vijay.hathimare on 10/18/19.
 */
public class DiceService {
    public static int roll() {
        return new Random().nextInt(6) + 1;
    }
}
