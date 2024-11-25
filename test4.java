public class test4 {
    public static void main(String[] args) throws InterruptedException {

        for(int h=0;h<24;h++)
        {
        for (int m = 0; m < 60; m++) {
            for (int s = 0; s < 60; s++) {
                
                System.out.print("\033[H\033[2J");
                System.out.flush(); 
                // Print the current time
                System.out.println(h+":"+m+":"+s);
                
                // Wait for 1 second
                Thread.sleep(1000);
               
            }
        }
    }
    }
}
