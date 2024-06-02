class Linear_Search {
    public static void main(String[] args) {

        //Commented line to test variables and methods.
       //System.out.println("Hello World! This is a test!");

       //Declare and initialize the array. Unordered to make it interesting.
       int[] evens = {2, 8, 6, 4, 10};

       //The number that the algorithm will search for.
        int lookup = 4;

        //Search through the array. If you find it, say so and where it was found. Otherwise say nothing.
       for(int i = 0; i < evens.length; i++) {
        if(lookup == evens[i]) {
            System.out.println("Found it! It's at index " + i);
        }
       }
    }
}