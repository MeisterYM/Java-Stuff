//Code could be improved later.
//Point is to understand Bubble Sort.

class Bubble_Sort {
    public static void main(String[] args) {

        //Creating an array to test algorithm.
        int[] thing = {2, 1, 5, 3, 0, 6, 4};

        //Assigning size of array to a variable.
        int size = thing.length;

        //First loop keeps track of the iteration.
        for(int i = 0; i < size - 1; i++) {

            //Second loop helps with comparing.
            for(int j = 0; j < size-i-1; j++) {

                //If current array element is greater than next element, swap. Otherwise do nothing.
                if(thing[j] > thing[j+1]) {
                    int placeholder = thing[j];
                    thing[j] = thing[j+1];
                    thing[j+1] = placeholder;
                }

            }

        }

        //Printing the values of the array in order.
        for(int k = 0; k < size; k++) {
            System.out.println(thing[k]);
        }

    }
}