public class Exceptions_DZ1_02 {
    //Посмотрите на код и подумайте сколько разных типов исключений вы тут сможете получить?
    public static void main(String[] args) {
        //System.out.println(sum2d(new String [][] {{}, {}})); // Index Out Of Bounds
        //System.out.println(sum2d(new String [][] {{"1", "2", "3", "4", "5"}, {"1", "2", "3"}})); // Также Index Out Of Bounds
        //System.out.println(sum2d(new String [][] {{"1", "2", "3", "4", "5"}, {"string1", "2", "3"}})); // NumberFormatException: For input string: "string1"
        //System.out.println(sum2d(new String [][] {{null, "2", "3", "4", "5"}, {"string1", "2", "3"}})); // NumberFormatException: Cannot parse null string
        System.out.println(sum2d(null)); // NullPointerException: Cannot read the array length because "arr" is null
    }
    
    public static int sum2d(String [][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i ++){
            for (int j = 0; j < 5; j ++){
                sum += Integer.parseInt(arr[i][j]);
            }
        }
        return sum;
    }
}
