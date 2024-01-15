public class StringOps {
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {
    }

    public static String lowerCase(String str) {
        String newString = ""; 
        char newChar; 
        int changer; 
        for(int i = 0; i < str.length();i++){
            newChar = str.charAt(i);
            if(newChar >= 'A' && newChar <= 'Z'){
                changer = (int)(newChar);
                changer = changer + 32;
                newChar = (char)changer; 
            }
            newString = newString + newChar;    
        }
        return newString;
    }

    public static String capVowelsLowRest (String string) {
        int length = string.length(); 
        String str = lowerCase(string);
        String newStr = ""; 
        for(int i = 0; i < length; i++){
            char newChar = str.charAt(i); 
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u'){
                newChar = (char)(str.charAt(i) - 32);  
            }
            newStr =  newStr + newChar; 
            } 
            return newStr;
        }
    
    public static String camelCase (String string) {
        int length = string.length(); 
        String str = lowerCase(string);
        String newStr = ""; 
        boolean spaceInd = false; 
        for(int i = 0; i < length; i++){
            if(str.charAt(i) == 32){
               spaceInd = true;
            } 
            else if(spaceInd==true){
                newStr = newStr + (char)(str.charAt(i)-32);
                spaceInd = false;
            }
            else{
                newStr = newStr + (char)str.charAt(i); 
            }  
        }   

        return newStr; 
    }

    public static int[] allIndexOf (String string, char chr) 
    {
    int count = 0;
    for(int i=0; i < string.length(); i++)
    {
        if(string.charAt(i) == chr)
            count++;
    }
    int[] arr = new int[count];
    int index = 0;
    for(int i=0; i < string.length(); i++)
      {
        if(string.charAt(i) == chr)
        {
          arr[index] = i;
          index++;
        }
      }
    return arr;
    }
}
