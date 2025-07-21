package First.src.day2;

public class SearchInStrings {
    public static void main(String[] args) {
        String name = "Mohan";
        char target = 'n';
        int ans = StringSearch(name, target);
        System.out.println(ans);
    }

    static int StringSearch(String name, char target){
        if(name.length() == 0){
            return -1;
        }
        for(int i = 0; i < name.length(); i++){
            if(name.charAt(i) == target){
                return i;
            }
        }
        return -1;
    }
}
