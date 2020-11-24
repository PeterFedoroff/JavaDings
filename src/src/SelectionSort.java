

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {9,2,33,1,6,2,17,10};
        System.out.println("Неотсортированный массив: ");
        print(arr);
        sort(arr);
        System.out.println("Отсортированный массив: ");
        print(arr);
    }
    public static void sort(int[] a){
        int min;
        for(int i = 0;i<a.length-1;i++){
            min = i;
            for(int j = i+1;j<a.length;j++){
                if(a[j]<a[min]){
                    min = j;
                }
            }
            swap(a,i,min);
        }
    }
    public static void swap(int[] a,int c,int k){
        int temp = a[c];
        a[c] = a[k];
        a[k] = temp;
    }

    public static void print(int[] a){
        for(int c:a){
            System.out.print(c+" ");
        }
        System.out.println("\n");
    }

}
