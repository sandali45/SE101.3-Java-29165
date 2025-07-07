public class javaIlloops {
        public static void main(String[] args) {

    // FOR loop: Print 1 to 5
        for (int i = 1; i <= 5; i++) 
        {
            System.out.println("For Loop i = " + i);
        }

        // WHILE loop: Countdown from 5
        int j = 5;
        while (j > 0) 
        {
            System.out.println("While Loop j = " + j);
            j--;
        }

        // DO-WHILE loop: Executes at least once
        int k = 0;
        do 
        {
            System.out.println("Do-While Loop k = " + k);
            k++;
        } 
        
        while (k < 3);
    }
}
    
