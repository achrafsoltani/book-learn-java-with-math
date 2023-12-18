package AI;

import java.util.Random;

public class Player {
    private String name;

    public Player(String name) {
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public int pick(){
        Random rand = new Random();
        int pick = rand.nextInt(1)+1;
        return pick;
    }
}