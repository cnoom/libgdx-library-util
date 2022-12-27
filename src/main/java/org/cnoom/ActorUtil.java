package org.cnoom;

import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.utils.Align;

import static org.cnoom.AlignUtil.getAlignValueHorizontal;
import static org.cnoom.AlignUtil.getAlignValueVertical;

public class ActorUtil {

    public static void align(Actor actor, Actor reference, int actorAlign, int referenceAlign, float sx, float sy) {
        actor.setPosition(reference.getX(referenceAlign) + sx, reference.getY(referenceAlign) + sy, actorAlign);
    }

    public static void align(Actor actor, Actor reference, int actorAlign, int referenceAlign) {
        align(actor, reference, actorAlign, referenceAlign, 0, 0);
    }

    public static void align(Actor actor, Actor reference, int Align, float sx, float sy) {
        align(actor, reference, Align, Align, sx, sy);
    }

    public static void align(Actor actor, Actor reference, int align) {
        align(actor, reference, align, align, 0, 0);
    }

    public static void align(Actor actor, int actorAlign, int parentAlign, float sx, float sy) {
        Actor parent = actor.getParent();
        actor.setPosition(parent.getWidth() * getAlignValueHorizontal(parentAlign) + sx, parent.getHeight() * getAlignValueVertical(parentAlign) + sy, actorAlign);
    }

    public static void align(Actor actor, int Align, float sx, float sy) {
        align(actor, Align, Align, sx, sy);
    }

    public static void align(Actor actor, int actorAlign, int parentAlign) {
        align(actor, actorAlign, parentAlign, 0, 0);
    }

    public static void align(Actor actor, int Align) {
        align(actor, Align, Align, 0, 0);
    }

    public static void resizeByScale(Actor actor, float scale, int align) {
        actor.setOrigin(align);
        actor.setSize(actor.getWidth() * scale, actor.getHeight() * scale);
    }

    public static void resizeByScale(Actor actor, float scale) {
        resizeByScale(actor, scale, Align.bottomLeft);
    }

    public static void resizeByWidth(Actor actor, float width) {
        resizeByScale(actor, width / actor.getWidth());
    }

    public static void resizeByHeight(Actor actor, float height) {
        resizeByScale(actor, height / actor.getHeight());
    }

    public static void resizeByWidthOrHeight(Actor actor, float width, float height) {
        if (actor.getWidth() >= actor.getHeight()) resizeByWidth(actor, width);
        else resizeByHeight(actor, height);
    }
}
