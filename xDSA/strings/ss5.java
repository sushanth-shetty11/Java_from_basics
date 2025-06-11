//WAP to find sum of digits present in a string

public class ss5 {
    public static void main(String[] args) {
        String s = "hello143";
        int sum =0;
        for(int i=0;i<=s.length()-1;i++){
            char ch = s.charAt(i);
            if(Character.isDigit(ch)){
                //sum += Character.getNumericValue(ch);
                sum += ch-'0';
            }
        }
        System.out.println(sum);
    }
}

// INPUT  = hello143
// OUTPUT = 8