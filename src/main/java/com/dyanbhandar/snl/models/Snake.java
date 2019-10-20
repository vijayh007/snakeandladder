package com.dyanbhandar.snl.models;

import lombok.Data;

/**
 * Created by vijay.hathimare on 10/18/19.
 */
@Data
public class Snake {
    private int start;
    private int end;

    public Snake(int start, int end){
        this.start = start;
        this.end = end;
    }
}
