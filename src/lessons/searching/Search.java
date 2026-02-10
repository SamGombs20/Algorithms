package lessons.searching;

public class Search {

    public static int linearSearch(int[] list, int v){
        int ret=100;
        for (int j=0;j<list.length;j++){
            if (list[j]==v){
                ret =j;
                break;
            }
        }
        return ret;
    }
}
