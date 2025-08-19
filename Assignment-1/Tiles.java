class Tiles {
    public static void main(String[] args) {
        
        int regionLength = 520; 
        int regionBreadth = 140; 

        int tileLength = 13; 
        int tileBreadth = 7; 

        int regionArea = regionLength * regionBreadth;
        int tileArea = tileLength * tileBreadth;

        int tiles = regionArea / tileArea;

        System.out.println("Area of region: " + regionArea + " cm²");
        System.out.println("Area of one tile: " + tileArea + " cm²");
        System.out.println("tiles: " + tiles);
    }
}
