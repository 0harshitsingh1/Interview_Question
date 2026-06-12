package StringQuestion;

public class BackspaceStringCompare {
    public static void main(String[] args) {
        // String s = "ab#c";
        // String t = "ad#c";
        String s = "a#c";
        String t = "b";

        System.out.println(getActual(s).equals(getActual(t)));
    }

    public static String getActual(String input){

        StringBuilder sb = new StringBuilder();

        int hashCount = 0;

        for(int i=input.length()-1; i>=0; i--){
            char curr = input.charAt(i);
            if(curr == '#'){
                hashCount++;
            }else if(hashCount > 0){
                hashCount--;
            }else{
                sb.append(curr);
            }
        }
        return sb.toString();
    }
}
