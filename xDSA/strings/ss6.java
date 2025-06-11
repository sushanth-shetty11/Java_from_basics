//Convert Uppercase to Lowercase and Lowercase to Uppercase

public class ss6 {
    public static void main(String[] args) {
        String s = "aBcD";
        char[] ch = s.toCharArray();
        for(int i=0;i<=ch.length-1;i++){
            
            if(Character.isUpperCase(ch[i])){
                ch[i] = Character.toLowerCase(ch[i]);
            }else{
                if(Character.isLowerCase(ch[i])){
                    ch[i] = Character.toUpperCase(ch[i]);
                }
            }
        }
        System.out.println(ch);
        
    }
}

//INPUT  = aBcD
//OUTPUT = AbCd