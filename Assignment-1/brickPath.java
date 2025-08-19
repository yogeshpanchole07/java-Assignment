class brickPath {
    public static void main(String args[]) {
        int lengthp = 120*100;
        double breadthp = 2.4*100;
        double lengthb = 24;
        double breadthb = 15;
        double pathArea = lengthp *breadthp;
        double brickArea = lengthb * breadthb;
        double noOfBricks = pathArea / brickArea;

        System.out.println("Number of bricks required: "+ noOfBricks);
    }
}
