package org.cnoom.gdx.util;

import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.utils.Align;

import static com.badlogic.gdx.utils.Align.center;
import static org.cnoom.gdx.util.AlignUtil.getAlignValueHorizontal;
import static org.cnoom.gdx.util.AlignUtil.getAlignValueVertical;

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

    public static void align(Actor centerActor, Actor reference) {
        align(centerActor, reference, center);
    }

    public static void align(Actor centerActor, Actor reference, float sx, float sy) {
        align(centerActor, reference, center, sx, sy);
    }

    public static Actor resizeByScale(Actor actor, float scale, int align) {
        actor.setOrigin(align);
        actor.setSize(actor.getWidth() * scale, actor.getHeight() * scale);
        return actor;
    }

    public static Actor resizeByScale(Actor actor, float scale) {
        return resizeByScale(actor, scale, Align.bottomLeft);
    }

    public static Actor resizeByWidth(Actor actor, float width) {
        return resizeByScale(actor, width / actor.getWidth());
    }

    public static Actor resizeByHeight(Actor actor, float height) {
        return resizeByScale(actor, height / actor.getHeight());
    }

    public static Actor reSizeByReference(Actor actor, Actor reference) {
        actor.setSize(reference.getWidth(), reference.getHeight());
        return actor;
    }

    public static Actor resizeByWidthOrHeight(Actor actor, float width, float height) {
        if (actor.getWidth() >= actor.getHeight()) resizeByWidth(actor, width);
        else resizeByHeight(actor, height);
        return actor;
    }

    public static Vector2 getSelfPos(Actor actor, int align) {
        return new Vector2(
                AlignUtil.getAlignValueHorizontal(align) * actor.getWidth(),
                AlignUtil.getAlignValueVertical(align) * actor.getHeight()
        );
    }
}
