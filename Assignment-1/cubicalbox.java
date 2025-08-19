class cubicalbox{
    public static void main(String args[]){
        int side = 3;
        int length = 15;
        int width = 9 ;
        int height = 12;
        int cubeVolume = side*side*side;
        int cartonVolume = length*width*height;
        double cubicalbox = cartonVolume/cubeVolume;
        System.out.println(" no of cubical boxes:"+cubicalbox);
    }
}