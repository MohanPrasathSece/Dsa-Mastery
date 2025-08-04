package First.src.day2;

public class SearchInStrings {
    public static void main(String[] args) {
        String name = "Mohan";
        char target = 'a';
        int ans = StringSearch(name, target);
        System.out.println(ans);
    }

   static int StringSearch(String name, char target){
        int i = 0;
        while(i < name.length()){
            if(target == name.charAt(i)){
                return i;
            }
            i++;
        }
        return -1;
   }
}
