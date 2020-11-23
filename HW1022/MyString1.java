public class MyString1 {

    // variable
    private char[] chars;
    
    // CONSTRUCTOR
    public MyString1(char[] chars){

        this.chars = new char[chars.length];

        for(int i = 0; i < chars.length; i++){
            this.chars[i] = chars[i];
        }
    }

    /**
     * charAt
     * @param index int
     * @return char (char at index)
     */
    public char charAt(int index){
        return(chars[index]);
    }

    /**
     * length
     * @return int (length of array)
     */
    public int length(){
        return(chars.length);
    }

    /**
     * substring
     * @param begin int
     * @param end int
     * @return MyString1 (substring)
     */
    public MyString1 substring(int begin, int end){

        char[] chars = new char[end - begin];

        for(int i = begin; i < end; i++){
            chars[i - begin] = this.chars[i];
        }

        MyString1 substring = new MyString1(chars);

        return substring;
    }

    /**
     * lowercase
     * @return MyString1(lowercase string)
     */
    public MyString1 lowercase(){

        for(int i = 0; i < chars.length; i++){
            if(this.chars[i] >= 65 && this.chars[i] <= 90){
                chars[i] = (char)(this.chars[i] + 32);
            }
            else{
                chars[i] = this.chars[i];
            }
        }

        MyString1 lowercase = new MyString1(chars);

        return lowercase;
    }

    /**
     * equals
     * @param s MyString1
     * @return boolean (equals other string)
     */
    public boolean equals(MyString1 s){
        boolean isEqual = true;

        for(int i = 0; i < s.length(); i++)
        {
            if(this.chars[i] != s.chars[i]){
                isEqual = false;
            }
        }

        return isEqual;
    }

    /**
     * valueOf
     * @param i int
     * @return MyString1 (value at string)
     */
    public static MyString1 valueOf(int i){
        int count = 0;
        int num = i;

        while(num > 0){
            num /= 10;
            count++;
        }

        char charArr[] = new char[count];
        num = i;

        for(int index = count - 1; index >= 0; index--){
            charArr[index] = (char)((num % 10) + '0');
            num = num / 10;
        }

        return new MyString1(charArr);
    }
}