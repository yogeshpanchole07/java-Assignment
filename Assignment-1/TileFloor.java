class TileFloor{
    public static void main(String args[]){
        int side = 10;
        int lengthf = 800;
        int widthf = 900;
        int tilearea = side * side;
        int floorarea = lengthf * widthf;
        double noOftiles = floorarea/tilearea;
        System.out.println("no of tiles: "+ noOftiles);
    }
}