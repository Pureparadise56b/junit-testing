public class RevString {
    public String reverseString(String str){
        char[] charsOfStr = str.toCharArray();
        int left = 0;
        int right = charsOfStr.length - 1;

        while(left < right){
            // swap the array.
            char tempCh = charsOfStr[left];
            charsOfStr[left] = charsOfStr[right];
            charsOfStr[right] = tempCh;

            left++;
            right--;
        }

        return new String(charsOfStr);
    }
}


