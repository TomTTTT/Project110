package edu.ucsd.cs110.temperature;

public class Fahrenheit extends Temperature
{
    private float t;
    public Fahrenheit(float t)
    {
        super(t);
        this.t = t;
    }

    @Override
    public Temperature toCelsius() {
        float cel = (t - 32) * 5 / 9;
        return new Celsius(cel);
    }

    @Override
    public Temperature toFahrenheit() {
        return this;
    }

    public String toString()
    {
        // TODO: Complete this method
        String str = "" + t+" F";
        return str;
    }
}

