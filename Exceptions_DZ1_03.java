public class Exceptions_DZ1_03 {
    public static void main(String[] args) {
        System.out.println(sum2arr( new int [] {1, 2, 3}, new int [] {1, 2})[1]);
    }

    public static int [] sum2arr(int [] a, int [] b){
        int len = Math.max(a.length, b.length);
        int [] c = new int [len];
        for (int i = 0; i < len; i ++){
            c[i] = a[i] + b[i];
        }
        return c;
    }
    
}
