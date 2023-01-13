package org.cnoom.gdx.util;

import com.badlogic.gdx.graphics.Color;


public class ColorUtil {
    public static Color color(float r,float g,float b){
        return new Color(r / 255, g / 255, b / 255, 1);
    }
}
