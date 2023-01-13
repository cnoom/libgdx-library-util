package org.cnoom.gdx.Actor;

import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.glutils.ShaderProgram;
import com.badlogic.gdx.scenes.scene2d.Group;

public class ShaderGroup extends Group {

    ShaderProgram shaderProgram;

    boolean isValid = false;
    ShaderGroup(ShaderProgram shaderProgram){
        this.shaderProgram = shaderProgram;
    }

    @Override
    public void draw(Batch batch, float parentAlpha) {
        if(!isValid){
            super.draw(batch,parentAlpha);
            return;
        }
        ShaderProgram batchShader = batch.getShader();
        batch.flush();
        batch.setShader(shaderProgram);
        super.draw(batch, parentAlpha);
        batch.flush();
        batch.setShader(batchShader);
    }
}
