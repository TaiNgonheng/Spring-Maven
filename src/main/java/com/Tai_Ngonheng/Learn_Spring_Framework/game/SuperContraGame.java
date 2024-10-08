package com.Tai_Ngonheng.Learn_Spring_Framework.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("SuperContraGameQualifier")
public class SuperContraGame implements GamingConsole {

    public void up() {
        System.out.println(" It's Super Contra Game.");
        System.out.println("skip");
    }

    public void down() {
        System.out.println("sit down");
    }

    public void left() {
        System.out.println("turn -90`");
    }

    public void right() {
        System.out.println("turn 90`");
    }
}