class AreaOfTriangle{ 
    public static void main(String args[]){
        int hypotenuse = 13;
        int height = 12;
        int basesquare = (13*13)-(12*12);
        double base = Math.sqrt(basesquare);
        double area = 0.5*base*height;
        System.out.println("length of other side:"+base);
        System.out.println("area of triangle:"+area);

    }
}