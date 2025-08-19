class Tile{
    public static void main(String args[]){
        int lengtht = 5 ;
        int widtht = 8;
        int lengthf = 200;
        int widthf = 400;
        int tilearea = lengtht * widtht;
        int floorarea = lengthf * widthf;
        double noOftiles = floorarea/tilearea;
        System.out.println("no of tiles: "+ noOftiles);
    }
}