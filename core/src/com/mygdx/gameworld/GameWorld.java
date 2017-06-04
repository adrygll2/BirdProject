package com.mygdx.gameworld;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.math.Rectangle;
import com.mygdx.gameobjects.Bird;

public class GameWorld {

    private Bird bird;

    public GameWorld (int midPoint){
        bird = new Bird(33,midPoint-5,17,12);
    }

    public void update (float delta){
        bird.update(delta);
    }

    public Bird getBird() {
        return bird;
    }

    public void setBird(Bird bird) {
        this.bird = bird;
    }
}
