/**
 * Created by Arnold on 20-12-2017.
 */
public class Problem004 implements Problem {

    //A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit
    //numbers is 9009 = 91 × 99.
    //Find the largest palindrome made from the product of two 3-digit numbers.

    public static void main(String[] args) {
        new Problem004().solve();
    }

    @Override
    public void solve() {
        int max = 1000;
        int highest = 0;

        StringBuilder sb = new StringBuilder();

        for(int x=1;x<max;x++){
            for(int y=1;y<max;y++){

                //Get the sum
                int sum = x*y;

                //Setup the string builder
                sb.setLength(0);
                sb.append(sum);

                //Make it into a string
                String n = sb.toString();

                //Can it be devided into 2 parts?
                if(n.length()%2==0){

                    String ns = n.substring(0,n.length()/2);    //Number Side
                    String nm = "";                             //Number Mirrored
                    String[] temp = ns.split("");

                    //Flip the array
                    for(int i=0;i<temp.length;i++){
                        nm+=temp[(temp.length-1)-i];
                    }

                    //Glue them together into a full number
                    String nf = ns+nm;
                    if(n.equals(nf)){
                        int parsed = Integer.parseInt(n);
                        if(parsed>highest)highest=parsed;
                    }
                }
            }
        }

        System.out.println(highest);
    }
}
