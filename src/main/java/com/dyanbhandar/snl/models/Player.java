package com.dyanbhandar.snl.models;

import lombok.Data;

import java.util.UUID;

/**
 * Created by vijay.hathimare on 10/18/19.
 */
@Data
public class Player {
    private String name;
    private String id;

    public Player(String name){
        this.name = name;
        this.id = UUID.randomUUID().toString();
    }
}
