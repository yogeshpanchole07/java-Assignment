class brickwallCost{
    public static void main(String args[]){
        int lengthb = 25;
        int widthb = 10;
        double heightb = 7.5;
        int lengthw = 20*100;
        int widthw = 2*100;
        double heightw = 0.75 *100;
        double brickVolume = lengthb*widthb*heightb;
        double wallVolume = lengthw*widthw*heightw;
        double noOfBricks = wallVolume/brickVolume;
        double totalcost= (noOfBricks*900)/1000.0; 
        System.out.println("no of bricks required :"+noOfBricks);
        System.out.println("total cost :"+ totalcost); 
    }
}