package org.cnoom.gdx.util;

import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Group;
import com.badlogic.gdx.utils.Align;

import static com.badlogic.gdx.utils.Align.center;

public class GroupUtil {
    private Group group;

    /**
     * 指定特定组进行添加
     */
    public GroupUtil(Group group) {
        this.group = group;
    }

    /**
     * 向组中添加一个演员并设置成该演员大小
     */
    public static void addActorAndSize(Group g, Actor a) {
        AddActorUtil.addActorAndSize(g, a);
    }

    public static void groupSetSizeByActor(Group g, Actor a) {
        g.setSize(a.getWidth(), a.getHeight());
    }

    /**
     * 按顺序向组中添加多个演员
     */
    public static void addActors(Group g, Actor... actors) {
        addActors(g, Align.bottomLeft, actors);
    }

    /**
     * 按顺序向组中添加多个演员
     */
    public static void addActors(Group g, int align, Actor... actors) {
        AddActorUtil.addActors(g, align, actors);
    }

    /**
     * @param groupAlign 组的的位标志常量
     * @param actorAlign 演员的位标志常量
     */
    public static void addActor(Group g, Actor actor, int groupAlign, int actorAlign, float sx, float sy) {
        AddActorUtil.addActor(g, actor, groupAlign, actorAlign, sx, sy);
    }

    public static void addActor(Group g, Actor actor, int groupAlign, int actorAlign) {
        addActor(g, actor, groupAlign, actorAlign, 0, 0);
    }

    public static void addActor(Group g, Actor actor, int align, float sx, float sy) {
        addActor(g, actor, align, align, sx, sy);
    }

    public static void addActor(Group g, Actor actor, int align) {
        addActor(g, actor, align, align, 0, 0);
    }

    public static void addActor(Group g, Actor centerActor) {
        addActor(g, centerActor, center);
    }

    public static void addActor(Group g, Actor centerActor, float sx, float sy) {
        addActor(g, centerActor, center, sx, sy);
    }

    public static void layout(Group g, Actor actor, int groupAlign, int actorAlign, float sx, float sy) {
        GroupUtils.layout(g, actor, groupAlign, actorAlign, sx, sy);
    }

    public static void layout(Group g, Actor actor, int groupAlign, int actorAlign) {
        layout(g, actor, groupAlign, actorAlign, 0, 0);
    }

    public static void layout(Group g, Actor actor, int align, float sx, float sy) {
        layout(g, actor, align, align, sx, sy);
    }

    public static void layout(Group g, Actor actor, int align) {
        layout(g, actor, align, align, 0, 0);
    }
    public static Actor getActorByName(Group g,String name){
        return GroupUtils.getActorByName(g,name);
    }
    public void setGroup(Group group) {
        this.group = group;
    }

    public void addActorAndSize(Actor a) {
        AddActorUtil.addActorAndSize(group, a);
    }

    public void groupSetSizeByActor(Actor a) {
        group.setSize(a.getWidth(), a.getHeight());
    }

    /**
     * 按顺序向组中添加多个演员
     */
    public void addActors(Actor... actors) {
        addActors(Align.bottomLeft, actors);
    }

    /**
     * 按顺序向组中添加多个演员
     */
    public void addActors(int align, Actor... actors) {
        AddActorUtil.addActors(group, align, actors);
    }

    /**
     * @param groupAlign 组的的位标志常量
     * @param actorAlign 演员的位标志常量
     */
    public void addActor(Actor actor, int groupAlign, int actorAlign, float sx, float sy) {
        AddActorUtil.addActor(group, actor, groupAlign, actorAlign, sx, sy);
    }

    public void addActor(Actor actor, int groupAlign, int actorAlign) {
        addActor(group, actor, groupAlign, actorAlign, 0, 0);
    }

    public void addActor(Actor actor, int align, float sx, float sy) {
        addActor(group, actor, align, align, sx, sy);
    }

    public void addActor(Actor actor, int align) {
        addActor(group, actor, align, align, 0, 0);
    }

    public void addActor(Actor centerActor) {
        addActor(group, centerActor, center);
    }

    public void addActor(Actor centerActor, float sx, float sy) {
        addActor(group, centerActor, center, sx, sy);
    }

    public void layout(Actor actor, int groupAlign, int actorAlign, float sx, float sy) {
        GroupUtils.layout(group, actor, groupAlign, actorAlign, sx, sy);
    }


    public void layout(Actor actor, int groupAlign, int actorAlign) {
        layout(group, actor, groupAlign, actorAlign, 0, 0);
    }

    public void layout(Actor actor, int align, float sx, float sy) {
        layout(group, actor, align, align, sx, sy);
    }

    public void layout(Actor actor, int align) {
        layout(group, actor, align, align, 0, 0);
    }

    public Actor getActorByName(String name){
        return getActorByName(group,name);
    }

    private static class AddActorUtil {
        public static void addActorAndSize(Group g, Actor a) {
            g.addActor(a);
            g.setSize(a.getWidth(), a.getHeight());
        }

        public static void addActors(Group g, int align, Actor... actors) {
            for (Actor a : actors) {
                g.addActor(a);
                a.setPosition(g.getWidth() * AlignUtil.getAlignValueHorizontal(align), g.getHeight() * AlignUtil.getAlignValueVertical(align), align);
            }
        }

        public static void addActor(Group g, Actor actor, int groupAlign, int actorAlign, float sx, float sy) {
            g.addActor(actor);
            actor.setPosition(g.getWidth() * AlignUtil.getAlignValueHorizontal(groupAlign) + sx, g.getHeight() * AlignUtil.getAlignValueVertical(groupAlign) + sy, actorAlign);
        }
    }

    private static class GroupUtils {
        public static void layout(Group g, Actor actor, int groupAlign, int actorAlign, float sx, float sy) {
            actor.setPosition(AlignUtil.getAlignValueHorizontal(groupAlign) * g.getWidth() + sx, AlignUtil.getAlignValueVertical(groupAlign) * g.getHeight() + sy, actorAlign);
        }

        public static Actor getActorByName(Group g, String name) {
            for (Actor child : g.getChildren()) {
                if (child.getName().equals(name)) {
                    return child;
                }
            }
            return null;
        }
    }
}
