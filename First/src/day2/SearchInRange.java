package First.src.day2;

public class SearchInRange {
    public static void main(String[] args) {
        String name = "mohanprasath";
        char target = 'h';
        int ans = SearchIndex(name, target);
        System.out.println(ans);
    }
    //given range is 5 to 11
    static int SearchIndex(String name, char target){
        int start = 5;
        int end = 12;
        for(int i = start; i < end; i++){
            if(target == name.charAt(i)){
                return i;
            }
        }
        return -1;
    }
}
