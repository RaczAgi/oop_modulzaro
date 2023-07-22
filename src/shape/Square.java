package shape;

public class Square extends Shape {
    private int a;

    public Square(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int perimeterSquare(){
        return 4*a;
    }
    public int areaSquare(){
        return a*a;
    }
}
