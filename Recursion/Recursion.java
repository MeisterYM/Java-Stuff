class Recursion {
    public static void main(String[] args) {
        //Calling the countdown function.
        countdown(-1);
    }

    //So long as the given number is greater than 0, the function will keep calling itself and decrease said number by 1.
    static int countdown(int number) {
        if(number < 0) {
            System.out.println("I can't do a countdown with that number!");
            return 0;
        } else if(number > 0) {
            System.out.println(number);
            return countdown(number - 1);
        } else {
            System.out.println("Liftoff!");
            return 0;
        }
    }

}