public class loop {

    public static void main(String[] args){

        //switch -->> when i want to test something's value
        int someThing = 3;

        switch (someThing){
            case 1:
                System.out.println("This is one");
                break;      // use break or else it will run the code given below
            case 2:
                System.out.println("This is two");
                break;
            case 3:
                System.out.println("This is three");
                break;
            default: // if it doesn't match any give below (above)
                System.out.println("No match found!");
        }




        //for loop
        //it's a machine that told how many times or how much other machine or code will run

        for (int i = 1; i < 10; i++){       //starting from 1-9 means 9 times it will run println function
            System.out.println(someThing);
        }


        //if....else
        //it's use for something specific direction

        if (someThing == 3){
            System.out.println("The number is " + someThing);
        }
        else{
            System.out.println("The number doesn't match");
        }


        //while
        //
        while (someThing < 10){
            System.out.println(someThing);
            someThing++;  // printed 3 to 9
        }
    }
}
