package cz.czechitas.intro;

import cz.czechitas.intro.api.Fish;
import cz.czechitas.intro.api.Stone;

public class HlavniProgram {

    public void main(String[] args) {


        Fish fish = new Fish(50, 50);

        new Stone(150, 150);

        for (int i = 0; i < 4; i++) {
            fish.moveForward(200);
            fish.turnRight();
        }


    }

}
