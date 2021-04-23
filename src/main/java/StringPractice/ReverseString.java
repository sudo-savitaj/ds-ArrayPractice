package StringPractice;

public class ReverseString {
    public void display() {
        char[] str = {'H','a','n','n','a','t'};
        reverse(str);
        System.out.println(str);
    }

    void reverse(char[] str){
        for(int i=0,j=str.length-1;i<j;i++,j--) {
            char aplha = str[i];
            str[i] = str[j];
            str[j] = aplha;

        }
    }
}
