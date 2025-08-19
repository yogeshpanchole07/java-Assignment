class quardilateral{
    public static void main(String args[]){
        int diagonal = 46;
        int height1 = 13;
        int height2 =10;
        double areaOfTriangle1 = 0.5*diagonal*height1;
        double areaOfTriangle2 = 0.5*diagonal*height2;
        double fieldArea = areaOfTriangle1 + areaOfTriangle2;
        System.out.println("area of the field :"+fieldArea);
    }
}