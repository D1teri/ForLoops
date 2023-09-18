/**
Version: 1.0.0
Author: D1teri or Dima K.
**/

public class ForLoops{
    public void run(){
        for (int i=0; i<=15; i++) {
            System.out.println(i);
        }
        for (int j = 10; j != 0; j = j - 2) {
            System.out.println(j);
        }
        for (int k = 10; k != 0; k = k - 3) {
            System.out.println(k); //it will run forever, because k never would be equal to 0
        }
    }
    public static void main(String[] args){
        ForLoops hw = new ForLoops();
        hw.run();
    }
}