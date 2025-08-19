class P43 {
    public static void main(String[] args) {
        double height = 4;
        double Height = 5;
        double rate = 10;

        
        double radius = Math.sqrt(Math.pow(Height, 2) - Math.pow(height, 2));

       
        double baseArea = Math.PI * Math.pow(radius, 2);

        double cost = baseArea * rate;

        System.out.printf("Cost of polishing the base: ", cost);
    }
}
