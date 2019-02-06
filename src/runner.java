public class runner {

    public static void main(String[] args){
        System.out.println(startHi("hi there"));
        int[] z = {1, 1, 2, 2, 1};
        System.out.println(noTriples(z));
        System.out.println(helloName("Bob"));
        System.out.println(repeatFront("Chocolate", 4));
        System.out.println(countYZ("fez day"));
        System.out.println(love6(6, 4));
        System.out.println(noTeenSum(1, 2, 3));
        int[] x = {1,2,3};
        int[] y = {7,3};
        System.out.println(commonEnd(x,y));
        System.out.println(no14(x));
        System.out.println(seriesUp(3));
    }

    //Warmup 1 startHi
    public static boolean startHi(String str) {
        if (str.length() < 2) {
            return false;
        }
        String hi = "hi";
        if (hi.equals(str.substring(0, 2))) {
            return true;
        } else {
            return false;
        }
    }

    //Warmup 2 noTriples
    public static boolean noTriples(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] == nums[i + 1] && nums[i] == nums[i + 2]) {
                return false;
            }
        }
        return true;
    }

    // String 1 helloName
    public static String helloName(String name) {
        return "Hello " + name + "!";
    }

    //String 2 repeatFront
    public static String repeatFront(String str, int n) {
        String word = "";
        for (int i=0; i<n; i++){
            word += str.substring(0,n-i);
        }
        return word;
    }

    //String 3 countYZ
    public static int countYZ(String str) {
        String strL = str.toLowerCase();
        int count = 0;
        if (strL.charAt(strL.length()-1) == 'y'){
            count += 1;
        }
        if (strL.charAt(strL.length()-1) == 'z'){
            count += 1;
        }
        for (int i=0; i<strL.length()-1; i++){
            if (strL.charAt(i) == 'y' && Character.isLetter(strL.charAt(i+1)) == false){
                count +=1;
            }
        }
        for (int i=0; i<strL.length()-1; i++){
            if (strL.charAt(i) == 'z' && Character.isLetter(strL.charAt(i+1)) == false){
                count +=1;
            }
        }
        return count;
    }

    //Logic 1 love6
    public static boolean love6(int a, int b) {
        if (a == 6 || b == 6){
            return true;
        }
        if (a + b == 6){
            return true;
        }
        if (Math.abs(a-b) == 6){
            return true;
        }
        else{
            return false;
        }
    }

    //Logic 2 noTeenSum
    public static int fixTeen(int n) {
        if (n>12 && n<20 && n!=15 && n!=16){
            n = 0;
        }
        return n;
    }

    public static int noTeenSum(int a, int b, int c) {
        a = fixTeen(a);
        b = fixTeen(b);
        c = fixTeen(c);
        return a + b + c;
    }

    //Array 1 commonEnd
    public static boolean commonEnd(int[] a, int[] b) {
        if (a[0] == b[0]){
            return true;
        }
        if (a[a.length-1] == b[b.length-1]){
            return true;
        }else{
            return false;
        }
    }

    //Array 2 no14
    public static boolean no14(int[] nums) {
        int ones = 0;
        int fours = 0;
        for (int i=0; i<nums.length; i++){
            if (nums[i] == 1){
                ones += 1;
            }
            if (nums[i] == 4){
                fours += 1;
            }
        }
        if (ones == 0 || fours == 0){
            return true;
        }else{
            return false;
        }
    }

    //Array 3 seriesUp
    public static int[] seriesUp(int n) {
        int[] arr = new int[n*(n + 1)/2];
        int pos = 0;
        for (int i=1; i<=n; i++){
            for (int j=i-1; j>=0; j--){
                arr[pos] = i-j;
                pos++;
            }
        }
        return arr;
    }
}

