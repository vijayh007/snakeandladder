package com.dyanbhandar.snl.models;

import lombok.Data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by vijay.hathimare on 10/18/19.
 */
@Data
public class SnakeAndLadderBoard {
    private int size;
    private List<Snake> snakes;
    private List<Ladder> ladders;
    private Map<String , Integer> playerPieces;

    public SnakeAndLadderBoard(int size){
        this.size = size;
        this.snakes = new ArrayList<Snake>();
        this.ladders = new ArrayList<Ladder>();
        this.playerPieces = new HashMap<String, Integer>();
    }

}
