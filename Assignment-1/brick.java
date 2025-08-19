class brick{
    public static void main(String args[]){
        int lengthb = 15;
        int widthb = 8;
        int heightb =5;
        int lengthw= 15 * 100;
        int widthw= 10 *100;
        int heightw=8 * 100;
        int brickVolume = lengthb*widthb*heightb;
        int wallVolume = lengthw*widthw*heightw;
        double noOfBricks = wallVolume/brickVolume;
        System.out.println(" no of bricks used to make a wall:"+noOfBricks);
    } 
}