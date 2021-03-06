/**
 * Created by Arnold on 20-12-2017.
 */
public class Problem005 implements Problem {

    //2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
    //What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?

    public static void main(String[] args) {
        new Problem005().solve();
    }

    @Override
    public void solve() {
        int number = 1;         //Counter
        boolean clear = false;  //This becomes true when the smallest number has been achieved
        int max = 20;

        while(!clear){
            number++;                           //This number counts up if the loop hasnt cleared
            boolean ruined = false;             //This become true when there has been a remainder
            for(int x=1;x<=max;x++){
                if(number%x!=0.0)ruined=true;   //If there are remainders, ruined becomes true
            }
            if(!ruined)clear=true;              //If it has not been ruined, the loop has been cleared
        }

        //Print the answer
        System.out.println(number);
    }

}
