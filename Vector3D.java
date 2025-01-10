import java.util.Vector;

public class Vector3D {
    private double x;
    private double y;
    private double z;

    public Vector3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public static void main(String[] args) {
        Vector3D vector1 = new Vector3D(10., 7., 8.);
        System.out.println("X: " + vector1.getX());
        System.out.println("Y: " + vector1.getY());
        System.out.println("Z: " + vector1.getZ());
        System.out.println(vector1.toString());
        System.out.println("Magnitude: " + vector1.getMagnitude());
        System.out.println("Normalized Vector: " + vector1.normalize());
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public String toString() {
        return "(" + String.format("%.2f", x) + ", " + String.format("%.2f", y) + ", " + String.format("%.2f", z) + ")";
    }

    public double getMagnitude() {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2));
    }

    public Vector3D normalize() {
        double magnitude = getMagnitude();
        if (magnitude == 0) {
            throw new IllegalStateException();
        } else {
            return new Vector3D(x / getMagnitude(), y / getMagnitude(), z / getMagnitude());
        }
    }
}
