package shape;

public class Circle extends Shape{
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int perimeterCircle(){
        return (int)(2*radius*Math.PI);
    }
    public int areaCircle(){
        return (int)(radius*radius*Math.PI);
    }
}
