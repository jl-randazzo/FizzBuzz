/**
 * Created by jl_ra on 9/13/2016.
 */


public class PCount {
    public static void main(String args[]){
        int index1 = 0, arith = 0;
        String testString = "1+2)*3-4)*5-6)))";
        while(index1 < testString.length()) {
            index1 = testString.indexOf(')', index1);
            for (int i = index1; i >= 0; i--) {
                if (testString.charAt(i) == ' ' || testString.charAt(i) == ')') continue;
                if (testString.charAt(i) == '(') {
                    arith--;
                    continue;
                }
                if (i == 0 && arith > 0){
                    testString = "(" + testString.substring(0, testString.length() - 1);
                    arith--;
                    break;
                }
                if (testString.charAt(i) >= 0 && testString.charAt(i) <= 9) continue;
                if (arith > 0) {
                    testString = testString.substring(0, i - 1) + "(" + testString.substring(i, testString.length() - 1);
                    arith--;
                    index1++;
                    continue;
                }
                if (testString.charAt(i) == '*' || testString.charAt(i) == '/' || testString.charAt(i) == '+' || testString.charAt(i) == '-') {
                    arith++;
                }
            }
            index1++;
        }
        System.out.println(testString);
    }

}
