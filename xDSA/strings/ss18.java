public class ss18 {
    public static void main(String[] args) {
        String s = "abacaba";

        for(int i=0;i<=s.length()-1;i++){
            for(int j=i+1;j<s.length();j++){

                String sub = s.substring(i, j);
                System.out.println(sub);

            }
        }
        
    }
}
