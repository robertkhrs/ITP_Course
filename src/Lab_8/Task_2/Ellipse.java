package Lab_8.Task_2;

class Ellipse extends Shapes {
    protected double radiusA;
    protected double radiusB;

    public Ellipse(double radiusA, double radiusB) {
        this.radiusA = radiusA;
        this.radiusB = radiusB;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radiusA * radiusB;
    }

    @Override
    public double calculatePerimeter() {
        double a = this.radiusA;
        double b = this.radiusB;
        return Math.PI * ( (3 * (a + b)) - Math.sqrt( (3*a + b) * (a + 3*b) ) );
    }
}
