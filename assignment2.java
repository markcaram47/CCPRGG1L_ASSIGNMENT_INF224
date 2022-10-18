public class assignment2 {
    public static void main (String[] args) throws Exception {

    // Use a while loop to print your FIRSTNAME three times.        
        int count = 3;
        while(count!=0) {
            System.out.println("JAN MARK");
            count--;
        }
        System.out.println("----------");
        
    // Use a do-while loop to print your MIDDLENAME four times.
        do {
            System.out.println("SALVADOR");
            count++;
        } while (count != 4);
        System.out.println("----------");

    // Use a for loop to print your SURNAME five times.
        for (int a = 0; a != 5; a++) {
            System.out.println("CARAM");
        }
        System.out.println("----------");

    // Create a char array that consists all of the characters of your FIRSTNAME 
    // and use a for loop to print each character of your FIRSTNAME. (example: ELIZER)
        String [] charactersOfmyfirstname = {"J", "A", "N", "M", "A", "R", "K"};
        for (int lettercount = 0; lettercount < charactersOfmyfirstname.length; lettercount++) {
            System.out.println(charactersOfmyfirstname[lettercount]);
        }
       System.out.println("----------");

    // Use a for loop to print the char array of your FIRSTNAME in REVERSE order (example: REZILE)

        String [] charactersOfmyfirstname1 = {"J", "A", "N", "M", "A", "R", "K"};
        for (int lettercount1 = charactersOfmyfirstname1.length-1; lettercount1 >= 0; lettercount1--) {
            System.out.println(charactersOfmyfirstname[lettercount1]);
        }
        System.out.println("----------");
    }
}
