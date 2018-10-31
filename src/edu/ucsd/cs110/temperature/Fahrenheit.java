package edu.ucsd.cs110.temperature;
public class Fahrenheit extends Temperature
{
    public Fahrenheit(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {

        Celsius toReturn = new Celsius((this.getValue() -32 ) * 5/9);
        return toReturn;

    }

    @Override
    public Temperature toFahrenheit() {
        return this;
    }

    public String toString()
    {
        String toReturn = "" + this.getValue() + " F";
        return toReturn;
    }
}