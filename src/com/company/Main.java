package com.company;

import java.util.Scanner;

public class Main {
    public static Character manager;
    public static Story story;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Вы установили замечательную игру Дока 2. \n "
                + "Осталось уладить формальности - введите свой ник (Введите ваше имя):");
        manager = new Character(in.next());
        story = new Story();
        while (true) {
            manager.mana += story.current_situation.dA;
            manager.hp += story.current_situation.dK;
            manager.gold += story.current_situation.dR;
            System.out.println("=====\nКоличество маны:" + manager.mana + "\tКоличество хп:"
                    + manager.hp + "\tКоличество золота:" + manager.gold + "\n=====");
            System.out.println("============="
                    + story.current_situation.subject + "==============");
            System.out.println(story.current_situation.text);
            if (story.isEnd()) {
                System.out
                        .println("====================the end!===================");
                return;
            }
            story.go(in.nextInt());
        }


    }
}
