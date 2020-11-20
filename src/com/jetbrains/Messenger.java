package com.jetbrains;

public class Messenger implements Runnable{
    private TimeCheck time = new TimeCheck();
    @Override
    public void run() {
        System.out.println(this.time.getTime());
    }
}
