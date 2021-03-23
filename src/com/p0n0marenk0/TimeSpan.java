package com.p0n0marenk0;

public class TimeSpan {
    private int hours;
    private int minutes;

    public TimeSpan(int hours, int minutes) {
        // minutes < 60
        if (minutes > 60) {
            throw new IllegalArgumentException("bla-bla");
        }
        this.hours = hours;
        this.minutes = minutes;
    }

    public void add(TimeSpan timeSpan) {
        int object1minuets = timeSpan.hours * 60 + hours * 60 + timeSpan.minutes + minutes;
        System.out.printf("Сумма методом add %02d:%02d", object1minuets / 60, object1minuets % 60);
        System.out.println();
    }

    public void sub(TimeSpan timeSpan) {
        int object1minuets = (timeSpan.hours * 60 + timeSpan.minutes) - (hours * 60 + minutes);
        System.out.printf("Отнимание методом sub %02d:%02d", object1minuets / 60, object1minuets % 60);
        System.out.println();
    }

    public void mult(double times) {
        hours = (int) (times * 60) / 60;
        minutes = (int) (times * 60) % 60;
        System.out.printf("Метод mult %02d:%02d", hours, minutes);
        System.out.println();
    }

    @Override
    public String toString() {
        return "TimeSpan{" +
                "hours=" + hours +
                ", minutes=" + minutes +
                '}';
    }
}
