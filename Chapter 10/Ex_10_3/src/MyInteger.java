public class MyInteger {
    private int value = 0;
    public MyInteger(){
    }
    public int getValue(){
        return value;
    }

    public boolean isOdd(){
        return isOdd(value);
    }
    public boolean isPrime(){
        return isPrime(value);
    }
     public boolean isEven(){
        return isEven(value);
    }

     public static boolean isEven(int A){
        if(A % 2 == 0)
        return true;
        return false;
    }
     public static boolean isOdd(int B){
        if(B % 2 != 0)
        return true;
        return false;
    }
     public static boolean isPrime(int C){
        for(int i = 2; i < C; i++)
            if(C % i == 0)
        return false;
            return true;
    }
    public static int parseInt(char[] A){
    int result =0;
    for(int i = 0;i<A.length;i++) {
        result = result * 10 + (A[i] - '0');
    } return result;
    }
    public static int parseInt(String B){
    int inum = Integer.parseInt(B);
    return inum;
    }
}
