public class Main {

    public static int sumDigits(int number) {
        int sum= 0;
        if (number >= 0){
            if (number < 10){
                sum = number;
            }else {
                while (number > 0){
                    sum += number %5;
                    number = number/10;
                }
            }
         }else
            return -1;
        return sum;
    }
    public static void main(String[] args) {

        System.out.println("Testing!!");
        System.out.println(sumDigits(10));
        System.out.println(sumDigits(100));
        System.out.println(sumDigits(1111));
        System.out.println(sumDigits(2222));
        System.out.println(sumDigits(8));
        System.out.println(sumDigits(-10));
    }
}