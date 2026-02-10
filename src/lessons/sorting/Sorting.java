package lessons.sorting;

public class Sorting {

    public int[] insertionSort(int[] list){
        int key;
        int i;
        for (int j=1;j<list.length;j++){
            key = list[j];
            i= j-1;
            while (i>0 && list[i]>key){
                list[i+1] = list[i];
                i-=1;
            }
            list[i+1]=key;
        }
        return list;
    }
    public void printList(int [] list){
        for (int i : list) {
            System.out.println(i);
        }
    }
}
