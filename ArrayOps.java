public class ArrayOps {
    public static void main(String[] args) {
        int miss = 0;
        int secondMax = 0;
        int[] arry = {4, 5, 0, 1, 2, 6};
        boolean same = false; 
        miss = findMissingInt(arry);
        secondMax = secondMaxValue(arry);
        System.out.println(miss);
        System.out.println(secondMax);
        int[] array1 = {1, 2, 4, 1, 1};
        int[] array2 = {1, 2, 4, 8};
        System.out.println(isSorted(array2));
        same = containsTheSameElements(array1, array2);
        System.out.println(same);
       
    }

    public static int[] sorthArray (int[] array) {
        int n = array.length; 
        for(int i = n-1; i > 0; i--) {
            for( int k = 0; k < i; k++){
                if (array[k] > array[k+1]){
                    int temp = array[k+1]; 
                    array[k+1] = array[k]; 
                    array[k] = temp;
                }
            }
        }
        return array; 
    } 
    
    public static int findMissingInt (int [] array) {  
        int n = array.length; 
        boolean found = false;
        int miss = 0;
        for(int i = 0; i <= n; i++){
            found = false;
            for(int j = 0; j < n; j++){
                if(array[j] == i){
                    found = true; 
                }
            }
            if(found == false){
                miss = i;
                break;
            }

        }
        return miss;
    }

      

    public static int secondMaxValue(int [] array) {
        /* sortArray function - implemented as a help function 
        int n = array.length; 
        for(int i = n-1; i > 0; i--) {
            for( int k = 0; k < i; k++){
                if (array[k] > array[k+1]){
                    int temp = array[k+1]; 
                    array[k+1] = array[k]; 
                    array[k] = temp;
                }
            }
        }
        return array[n-2];
    */
        int n = array.length;
        array = sorthArray(array);
        return array[n-2];  
    }
    

    public static boolean containsTheSameElements(int [] array1,int [] array2) {
        int n1 = array1.length; 
        int n2 = array2.length; 
        int newArray1l = 1;    // number of diffrent numbers in array1 (at least 1)
        int newArray2l = 1;    //  number of diffrent numbers in array2 (at least 1)
    
        int [] newArray1 = new int[n1];  // newArray1 contains a list of different numbers in Array1
        int [] newArray2 = new int[n2];  // newArray2 contains a list of different numbers in Array2

        array1 = sorthArray(array1);   // sorthing the numbers in Array 1 
        array2 = sorthArray(array2);   // sorthing the numbers in Array 2  

        newArray1[0] = array1[0];
        for(int i = 1; i < n1; i++){
            if(newArray1[newArray1l - 1] != array1[i]){
               newArray1[newArray1l] = array1[i]; 
               newArray1l++;
            }
        }
        
        newArray2[0] = array2[0];
        for(int i = 1; i < n2; i++){
            if(newArray2[newArray2l - 1] != array2[i]){
                newArray2[newArray2l] = array2[i]; 
                newArray2l++;
            }
        }

        if(newArray1l != newArray2l){
            return false;
        }
        else {
            for(int i = 0; i <= newArray1l; i++){
                if(newArray1[i] != newArray2[i]){
                    return false; 
                }
            }
        }
        return true;
    }




    public static boolean isSorted(int [] array) {
        int length = array.length;
        int counter = 0;
        boolean incrlist = false; 
        boolean sorted = true;
       
        while ((array[counter] == array[counter+1]) && (counter < (length-1))) {
            counter++;
        }
       
        if(counter == (length-1)){
            return true;
        }

        if (array[counter] < array[counter+1]) {
            incrlist = true; 
        }
        
        for (int i = counter; i < length-1; i++){
            if ((incrlist == true) && (array[i] > array[i+1])){
                sorted = false;
            }
            if ((incrlist == false) && (array[i] < array[i+1])){
                sorted = false;
            }
        
        }       
        return sorted;
    }

}
