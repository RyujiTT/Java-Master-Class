public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello, Tim");

        boolean isAilen = false;
        if (isAilen == true) {
            System.out.println("It is not an alien!");
        }else {
            System.out.println("It is an alien");
        }

        int topScore = 80;
        if (topScore < 100) {
            System.out.println("You got the high score!");
        }

        int secondTopScore = 81;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than second top score and less than 100");
        }

        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both of the conditions are true");
        }

        int newValue = 50;
        if (newValue == 50){
            System.out.println("This is true");
        }

        boolean isCar = false;
        if (!isCar/*isCar == false*/){
            System.out.println(("This is supposed to happen"));
        }

        String makeOfCar = "Volkswagen";
        boolean isDomestic = makeOfCar == "Volkswagen" ? false : true;
        if (isDomestic){
            System.out.println("This car is domestic to our country");
        }

        String s = (isDomestic) ? "This car is domestic" : "This car is not domestic";
        System.out.println(s);

        /* Challenge
        Step1: create a double variable with a value of 20.00.
        Step2: create a second variable of type double with a value 80.00.
        Step3: add both numbers together, then multiply by 100.00.
        Step4: use the remainder operator, to figure out what the remainder from th result of the operation in step three, and 40.00, will be.
        Step5: create a boolean variable that assigns the value true, if the remainder in step four is 0.00, or false if it's not zero.
        Step6: output the boolean variable just to see what the result is.
        Step7: write an if-then statement that displays a message, 'got some remainder'. if the boolean in step five is not true
        */

        double myFirstValue = 20.00d;
        double mySecondValue = 80.00d;
        double myTotalValue = (myFirstValue + mySecondValue) * 100.00d;
        System.out.println("MyTotalValue =" + myTotalValue);
        double theRemainder = myTotalValue % 40.00d;
        System.out.println("theRemainder = " + theRemainder);
        boolean isNoRemainder = theRemainder == 0 ? true : false;
        System.out.println(isNoRemainder);
        if (!isNoRemainder){
            System.out.println("I got some remainder");
        }
    }
}
