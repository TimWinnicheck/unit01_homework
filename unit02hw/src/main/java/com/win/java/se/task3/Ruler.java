package main.java.com.win.java.se.task3;

public class Ruler extends RulingImplement {

    public String name = "Ruler";
    public Double precision;

    Ruler () {
        this.precision = 1.0;
        this.name = name;
        this.cost = 60;
        this.length = 10;
    }

    Ruler (double precision, int cost, int length)
    {
        if (precision <= 0.0 || cost <= 0 || length <= 0)
        {
            throw new IllegalArgumentException();
        }
        this.precision = precision;
        this.name = name;
        this.cost = cost;
        this.length = length;
    }
}