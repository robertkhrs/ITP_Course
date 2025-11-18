package Lab_8.Task_2;

class Triangle extends Shapes {
    protected double sideA;
    protected double sideB;
    protected double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }
    @Override
    public double calculatePerimeter() {
        return sideA + sideB + sideC;
    }
    @Override
    public double calculateArea() {
        double s = calculatePerimeter() / 2.0;
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }
}
