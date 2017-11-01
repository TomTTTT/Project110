package edu.ucsd.cs110.temperature;

public class Celsius extends Temperature
{
    private float t;

    public Celsius(float t)
    {
        super(t);
        this.t = t;
    }

    @Override
    public Temperature toCelsius() {
        return this;
    }

    @Override
    public Temperature toFahrenheit() {
        float fah = t*9/5 + 32;
        return new Fahrenheit(fah);
    }

    public String toString()
    {
        // TODO: Complete this method
        String str = "" + t+" C";
        return str;
    }
}
