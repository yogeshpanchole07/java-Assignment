class GardenArea {
    public static void main(String args[]) {
        int Sideg = 150;    
        int Sidep = 25;       

        int gardenArea = Sideg * Sideg;
        int poolArea = Sidep * Sidep;

        int Area = gardenArea - poolArea;

        System.out.println("area of the garden: " + Area );
    }
}
