class P38{
    public static void main(String args[]){
        double volume =1287;
        double r= 10;
        double h = volume/((22/7)*r*r);
        System.out.println("height:" +h);
        double area = (2*(22/7)*r*h)+(2*(22/7)*r*r);
        System.out.println("area :"+area);
    }
}