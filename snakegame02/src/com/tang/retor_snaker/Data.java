package com.tang.retor_snaker;

import javax.swing.*;
import java.net.URL;

public class Data {
//    private static URL bodyURL = Data.class.getResource("/com/tang/retor_snaker/image/body.png");
//    private static ImageIcon body = new ImageIcon(bodyURL);
//    private static ImageIcon food = new ImageIcon(Data.class.getResource("/com/tang/retor_snaker/image/food.png"));
//
//    private static ImageIcon up = new ImageIcon(Data.class.getResource("/com/tang/retor_snaker/image/up.png"));
//    private static ImageIcon down = new ImageIcon(Data.class.getResource("/com/tang/retor_snaker/image/down.png"));
//    private static ImageIcon left = new ImageIcon(Data.class.getResource("/com/tang/retor_snaker/image/left.png"));
//    private static ImageIcon right = new ImageIcon(Data.class.getResource("/com/tang/retor_snaker/image/right.png"));
    private static URL bodyURL = Data.class.getResource("/com/tang/retor_snaker/im1/body.png");
    private static ImageIcon body = new ImageIcon(bodyURL);
    private static ImageIcon food = new ImageIcon(Data.class.getResource("/com/tang/retor_snaker/im1/food.png"));
    private static ImageIcon up = new ImageIcon(Data.class.getResource("/com/tang/retor_snaker/im1/up.png"));
    private static ImageIcon down = new ImageIcon(Data.class.getResource("/com/tang/retor_snaker/im1/down.png"));
    private static ImageIcon left = new ImageIcon(Data.class.getResource("/com/tang/retor_snaker/im1/left.png"));
    private static ImageIcon right = new ImageIcon(Data.class.getResource("/com/tang/retor_snaker/im1/right.png"));

    public static ImageIcon getBody() {
        return body;
    }

    public static void setBody(ImageIcon body) {
        Data.body = body;
    }

    public static ImageIcon getUp() {
        return up;
    }

    public static void setUp(ImageIcon up) {
        Data.up = up;
    }

    public static ImageIcon getDown() {
        return down;
    }

    public static void setDown(ImageIcon down) {
        Data.down = down;
    }

    public static ImageIcon getLeft() {
        return left;
    }

    public static void setLeft(ImageIcon left) {
        Data.left = left;
    }

    public static ImageIcon getRight() {
        return right;
    }

    public static void setRight(ImageIcon right) {
        Data.right = right;
    }

    public static ImageIcon getFood() {
        return food;
    }

    public static void setFood(ImageIcon food) {
        Data.food = food;
    }
}

