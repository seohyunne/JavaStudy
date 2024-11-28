package sort;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {64,34,25,17,22,11,90};
        SelectionSort(array);
    }
    public static void SelectionSort(int[] array){
        int n = array.length;  // 7

        for(int i=0; i<n; i++){
            int minIndex = i;
            for (int j=i+1; j<n;j++ ){
                if(array[j]<array[minIndex]){
                    minIndex = j;
                }
            }
            int temp = array[minIndex];  // 가장 작은 값을 temp에 저장
            array[minIndex]= array[i];
            array[i]=temp;

        }
    }
}
