package com.p0n0marenk0;

public class Main {

    public static void main(String[] args) {
    TimeSpan timeSpan1 = new TimeSpan(11, 55);
    TimeSpan timeSpan2 = new TimeSpan(11, 50);
    timeSpan1.add(timeSpan2);
    //timeSpan2.sub(timeSpan1);
    timeSpan1.mult(5.5);
    }
}
