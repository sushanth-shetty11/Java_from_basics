public class ss20 {
    public static void main(String[] args) {
        String s = "abacaba";
        String longest="";
        int maxlength =0;

        for(int i=0;i<=s.length()-1;i++){
            for(int j=i+1;j<s.length();j++){

                String sub = s.substring(i, j);
                isPalindrome(sub);
                System.out.println(sub);
                if(s.length()>maxlength){
                    s.length=maxlength;

                    longest = s.length();
                }
                System.out.println(longest);

            }
          } 
        }
        static boolean isPalindrome(String s){
            return s.equals(new StringBuffer().reverse().toString());
        
    }
}
