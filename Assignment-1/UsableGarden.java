class UsableGarden {
    public static void main(String args[]) {
        int Lengthg = 30;     
        int Breadthg = 20;    

        int Path1Width = 3; 
        int Path2Width = 4; 

        int gardenArea = Lengthg * Breadthg;
        int Path1Area = Path1Width * Breadthg;
        int Path2Area = Path2Width * Lengthg;
        int overlapArea = Path1Width * Path2Width;

        int totalPathArea = Path1Area + Path2Area - overlapArea;
        int usableArea = gardenArea - totalPathArea;

        System.out.println("Usable area of the garden: " + usableArea );
    }
}
