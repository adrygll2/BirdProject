package com.mygdx.gameworld;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType;


public class GameRenderer {

    private GameWorld myWorld;
    private OrthographicCamera cam;
    private ShapeRenderer shapeRenderer;

    public GameRenderer (GameWorld world){
        myWorld = world;
        cam = new OrthographicCamera();
        shapeRenderer = new ShapeRenderer();
        cam.setToOrtho(true, 136, 204);
        shapeRenderer.setProjectionMatrix(cam.combined);
    }

    public void render (){
        Gdx.app.log("GameRenderer", "render");

    }
}
