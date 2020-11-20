package com.jetbrains;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Messenger message = new Messenger();

        for(int i =0;i < 10; i++)
        {
            new Thread(message, "Message thread").start();
            Thread.sleep(5000);
        }
    }
}
