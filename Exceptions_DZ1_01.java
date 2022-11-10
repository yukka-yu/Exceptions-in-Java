// Реализуйте 3 метода, чтобы в каждом из них получить разные исключения
public class Exceptions_DZ1_01{
    public static void main(String[] args) {
        System.out.println(IntFromString(null));
        System.out.println(sum(new int[] {1, 2, 3}));
        System.out.println(divide(3, 0));
        
    }

    public static int divide(int a, int b){
        return a / b;
    }

    public static int sum(int [] a) {
        int s = 0;
        for (int i = 0; i < 6; i ++) {
            s += a[i];
        }
        return s;
    }

    public static int IntFromString(String s) {
        return Integer.parseInt(s);
    }
}