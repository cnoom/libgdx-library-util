package org.cnoom;


import com.badlogic.gdx.utils.Align;

public class AlignUtil {

    public static float getAlignValueHorizontal(int align) {
        if (Align.isLeft(align)) return 0;
        else if (Align.isRight(align)) return 1;
        return .5f;
    }

    public static float getAlignValueVertical(int align) {
        if (Align.isBottom(align)) return 0;
        else if (Align.isTop(align)) return 1;
        return .5f;
    }
}
