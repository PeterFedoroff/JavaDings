public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {9,2,33,1,6,2,17,10};
        System.out.println("Неотсортированный массив: ");
        print(arr);
        sort(arr);
        System.out.println("Отсортированный массив: ");
        print(arr);
    }
    public static void sort(int[] a){
        int key;
        int j;
        for(int i = 1;i<a.length;i++){
            key = a[i];
            j = i;
            while(j > 0 && a[j-1] > key){
                a[j] = a[j-1];
                j--;
            }
            a[j] = key;
        }

    }

    public static void print(int[] a){
        for(int c:a){
            System.out.print(c+" ");
        }
        System.out.println("\n");
    }
}
