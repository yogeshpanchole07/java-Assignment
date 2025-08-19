class park{
    public static void main(String args[]){
        int length = 50;
        int breadth= 30;
        int rounds = 10;
        int perimeter = 2*(length+breadth);
        int distance = perimeter * rounds;
        double distanceInKm = distance/1000.0;
        System.out.println("distance he cover in a day:"+ distanceInKm+"km");
    }
}