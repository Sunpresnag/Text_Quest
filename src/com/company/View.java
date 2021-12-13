package com.company;

import java.util.Scanner;

public class View {
    static Scanner in = new Scanner(System.in);
    UserChoiceListener ucl;
    View(UserChoiceListener ucl){
        this.ucl = ucl;
    }
    void showLocation(Location location){
        System.out.println(location.getText());
        Action[] actions = location.getActions();
        for (int i = 0; i < actions.length; ++i){
            System.out.println(i + 1 + ") "+ actions[i].getText());
        }
        int ans = in.nextInt() - 1;
        ucl.userChoise(ans);
    }
}