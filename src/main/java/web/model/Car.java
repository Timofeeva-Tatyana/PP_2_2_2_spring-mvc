package web.model;

public class Car {
    private String color;
    private String marka;
    private String engine;

    public Car(String color, String marka, String engine) {
        this.color = color;
        this.marka = marka;
        this.engine = engine;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }
}
