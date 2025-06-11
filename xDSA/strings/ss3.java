//counting  no. of alphabets, numbers and special characters

public class ss3 {
    public static void main(String[] args) {
        String str ="Abc@123";
        int ac=0, dc =0, sc=0;
        for(int i=0;i<=str.length()-1;i++){
            char ch = str.charAt(i);
            if(ch>='a'&&ch<='z'|| ch>='A'&&ch<='Z'){
                ac++;
            }
            else if(ch>='0'&& ch<='9'){
                    dc++;
                }
                else{
                    sc++;
                }
            }
            System.out.println("alphabets = "+ac);
            System.out.println("digits = "+dc);
            System.out.println("special character = "+sc);

        }
    }


// public class ss3 {
//     public static void main(String[] args) {
//         String str ="Abc@123";
//         int ac=0, dc =0, sc=0;
//         for(int i=0;i<=str.length()-1;i++){
//             char ch = str.charAt(i);
//             if(Character.isAlphabetic(ch))
//                 ac++;
//             else if (Character.isDigit(ch))
//                 dc++;
//             else
//                 sc++;
            
//         }
//         System.out.println("alphabets = "+ac);
//         System.out.println("digits = "+dc);
//         System.out.println("special character = "+sc);

//     }
// }


// INPUT  = Abc@123
// OUTPUT = alphabets = 3
            // digits = 3
            // special character = 1