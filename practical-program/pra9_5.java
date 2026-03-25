    interface calulate {
        public abstract void areaofcircle(double r);
        public abstract void areaofrectangle(double l, double b);
    }
    public class pra9_5 {
        final double PI = 3.14;
        void areaofcircle(double r) {
            System.out.println("Area of circle: " + PI*r*r);
        }
        void areaofrectangle(double l,double b) {
            System.out.println("Area of rectangle: " + l*b);
        }

        public static void main(String[] args) {
            pra9_5 p = new pra9_5();
            p.areaofcircle(5);
            p.areaofrectangle(5, 5);
        }
    }
// Aditya Meshram