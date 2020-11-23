public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {9,2,33,1,6,2,17,10};
        System.out.println("Неотсортированный массив: ");
        print(arr);
        sort(arr);
        System.out.println("Отсортированный массив: ");
        print(arr);

    }
    public static void sort(int[] a){
        for(int i = 0;i<a.length;i++){
            for(int j = 0;j<a.length-i-1;j++){
                if(a[j]>a[j+1]){
                    swap(a,j,j+1);
                }
            }
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
    }
}
