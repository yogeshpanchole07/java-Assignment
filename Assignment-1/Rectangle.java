class Rectangle {
    public static void main(String[] args[]) {
        int perimeter = 230; 
        int length = 70;     

        
        int breadth = (perimeter / 2) - length;

        
        int area = length * breadth;

        
        System.out.println("Breadth of the rectangle: " + breadth + " cm");
        System.out.println("Area of the rectangle: " + area + " cm²");
    }
}
