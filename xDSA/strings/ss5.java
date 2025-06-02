public class ss5 {
    public static void main(String[] args) {
        String str = "2ab@c125";
        int cd=0;
        for(int i=0;i<=str.length()-1;i++){
            char ch = str.charAt(i);
            if(Character.isDigit(ch)){
                cd=cd+Character.getNumericValue(ch);
            }
        }
        System.out.println(cd);
    }
}
