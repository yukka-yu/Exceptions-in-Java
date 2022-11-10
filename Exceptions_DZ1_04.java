public class Exceptions_DZ1_04 {
    public static void main(String[] args) {
        System.out.println(sum2arr( new int [] {1, 2, 3}, new int [] {1, 2})[1]);
    }

    public static int [] sum2arr(int [] a, int [] b){
        
        if (a.length != b.length){
            throw new RuntimeException("Длины массивов не одинаковы!");
        }
        else{
            int [] c = new int [a.length];
            for (int i = 0; i < a.length; i ++){
                c[i] = a[i] + b[i];
            }
            return c;
        }
     
    }
    
}
