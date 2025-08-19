class Trapezoid{
    public static void main(String args[]){
        int base1 = 128;
        int base2 = 92;
        int height = 40;
        int width = 4;
        double area = 0.5*height*(base1 + base2);
        double path = height * width;
        double woodenarea = area - path;
        System.out.println("wooden area :" + woodenarea);
    }
}