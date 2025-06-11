//WAP to count vowels and consonants present in a string

public class ss4 {
    public static void main(String[] args) {
        String str = "aeiouX!";
        str= str.toLowerCase();
        
        int vowels=0;
        int consonants =0;
        for(int i=0;i<=str.length()-1;i++){
            char ch= str.charAt((i));
            if(Character.isAlphabetic(ch)){
                if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ){
                vowels++;
            }
            else{
                consonants++;
            }
            }
            
        }
        System.out.println("vowels = "+vowels);
         System.out.println("consonants = "+consonants);
    }
}

// INPUT  = AeiOuX!
// OUTPUT = vowels = 5
//          consonants = 1
