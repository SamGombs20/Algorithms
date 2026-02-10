import lessons.sorting.Sorting;

void main() {
    Sorting sort = new Sorting();
    int [] arr = {3,2,1,10,9,7};
    sort.printList(arr);
    System.out.println(Arrays.toString(sort.insertionSort(arr)));
}
