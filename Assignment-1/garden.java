class garden{
    public static void main(String args[]){
        int length = 22;
        int breadth = 15;
        int side = 21;
        int shellyArea = length * breadth;
        int rachelArea = side*side;
        int difference = shellyArea - rachelArea;
        System.out.println("area of shelly garden:"+shellyArea);
        System.out.println("area of rachel garden:"+rachelArea);
        System.out.println("difference in area"+difference);
        System.out.println("rachel garden is bigger");
    }
}