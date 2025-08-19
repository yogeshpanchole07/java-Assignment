class triangleRatio{
    public static void main(String args[]){
        
        int baseratio = 8;
        int heightratio=5;
        int area = 320;
        double asquare = (320*2)/(8*5);
        double a = Math.sqrt(asquare);
        double base = baseratio * a;
        double height = heightratio *a;
        System.out.println("sqare of a:"+ asquare);
        System.out.println("a :"+a);
        System.out.println("height :" +height);
        System.out.println("base:"+base);
    }
}