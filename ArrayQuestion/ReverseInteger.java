package ArrayQuestion;

public class ReverseInteger {

    public int reverseInteger(int nums){
        int res = 0;

        while(nums != 0){
            int digit = nums % 10;

            if(res > Integer.MAX_VALUE || 
                res < Integer.MIN_VALUE){
                    return 0;
                }
            res = res * 10 + digit;
            nums = nums / 10;
        }
        return res;
    }
    public static void main(String[] args) {
        ReverseInteger RI = new ReverseInteger();

        int nums = 123;
        System.out.println(RI.reverseInteger(nums));
    }
}
