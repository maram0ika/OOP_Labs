public public class Vector3D {
   private double x;
    private double y;
    private double z;

    public Vector3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vector3D add(Vector3D other) {
        return new Vector3D(
                this.x + other.x,
                this.y + other.y,
                this.z + other.z
        );
    }

    public Vector3D subtract(Vector3D other) {
        return new Vector3D(
                this.x - other.x,
                this.y - other.y,
                this.z - other.z
        );
    }

    public Vector3D multiply(double number) {
        return new Vector3D(
                this.x * number,
                this.y * number,
                this.z * number
        );
    }

    public double dot(Vector3D other) {
        return this.x * other.x
                + this.y * other.y
                + this.z * other.z;
    }


    public Vector3D cross(Vector3D other) {
        return new Vector3D(
                this.y * other.z - this.z * other.y,
                this.z * other.x - this.x * other.z,
                this.x * other.y - this.y * other.x
        );
    }


    public double length() {
        return Math.sqrt(
                x * x +
                y * y +
                z * z
        );
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

    
}
