class pathArea {
    public static void main(String args[]) {
        int noOfBricks = 100;
        int length = 24;   
        int breadth = 15;  
        int brickarea = length * breadth;
        int totalArea = noOfBricks * brickarea;
        System.out.println("Area of the path: " + totalArea);
    }
}
