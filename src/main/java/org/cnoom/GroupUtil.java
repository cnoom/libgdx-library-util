package org.cnoom;

import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Group;
import com.badlogic.gdx.utils.Align;

import static org.cnoom.AlignUtil.getAlignValueHorizontal;
import static org.cnoom.AlignUtil.getAlignValueVertical;

public class GroupUtil {
    public static void addActorAndSize(Group g, Actor a){
        g.addActor(a);
        g.setSize(a.getWidth(),a.getHeight());
    }
    public static void groupSetSizeByActor(Group g,Actor a){
        g.setSize(a.getWidth(),a.getHeight());
    }
    public static void addActors(Group g,Actor... actors){
        addActors(g,Align.bottomLeft,actors);
    }
    public static void addActors(Group g, int align,Actor... actors){
        for (Actor a : actors) {
            g.addActor(a);
            a.setPosition(g.getWidth() * getAlignValueHorizontal(align),g.getHeight()*getAlignValueVertical(align),align);
        }
    }
    public static void addActor(Group g,Actor actor,int groupAlign,int actorAlign,float sx,float sy){
        g.addActor(actor);
        actor.setPosition(g.getWidth()*getAlignValueHorizontal(groupAlign)+sx,g.getHeight()*getAlignValueVertical(groupAlign)+sy,actorAlign);
    }
    public static void addActor(Group g,Actor actor,int groupAlign,int actorAlign){
        addActor(g,actor,groupAlign,actorAlign,0,0);
    }
    public static void addActor(Group g,Actor actor,int align,float sx,float sy){
        addActor(g,actor,align,align,sx,sy);
    }
    public static void addActor(Group g,Actor actor,int align){
        addActor(g,actor,align,align,0,0);
    }

    public static void addActorBefore(Group g,Actor actorBefore,Actor actor,int groupAlign,int actorAlign,float sx,float sy){
        g.addActorBefore(actorBefore,actor);
        actor.setPosition(g.getWidth()*getAlignValueHorizontal(groupAlign)+sx,g.getHeight()*getAlignValueVertical(groupAlign)+sy,actorAlign);
    }

    public static void addActorBefore(Group g,Actor actorBefore,Actor actor,int groupAlign,int actorAlign){
        addActorBefore(g,actorBefore,actor,groupAlign,actorAlign,0,0);
    }
    public static void addActorBefore(Group g,Actor actorBefore,Actor actor,int align,float sx,float sy){
        addActorBefore(g,actorBefore,actor,align,align,sx,sy);
    }
    public static void addActorBefore(Group g,Actor actorBefore,Actor actor,int align){
        addActorBefore(g,actorBefore,actor,align,align,0,0);
    }
    public static void layout(Group g,Actor actor,int groupAlign,int actorAlign,float sx,float sy){
        actor.setPosition(getAlignValueHorizontal(groupAlign)*g.getWidth()+sx,getAlignValueVertical(groupAlign)*g.getHeight()+sy,actorAlign);
    }

    public static void layout(Group g,Actor actor,int groupAlign,int actorAlign){
        layout(g,actor,groupAlign,actorAlign,0,0);
    }
    public static void layout(Group g,Actor actor,int align,float sx,float sy){
        layout(g,actor,align,align,sx,sy);
    }

    public static void layout(Group g,Actor actor,int align){
        layout(g,actor,align,align,0,0);
    }
}
