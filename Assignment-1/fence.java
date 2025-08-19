class fence{
    public static void main(String args[]){
        int costs = 1600;
        int length = 20;
        int rate = 25;
        int perimeter = 1600 / rate;
        int breadth = (perimeter / 2) - length;
        int area = length * breadth;
        System.out.println("breadth of park:"+breadth);
        System.out.println("perimeter of park:"+perimeter);
        System.out.println("area of the field:"+area);
    }
}