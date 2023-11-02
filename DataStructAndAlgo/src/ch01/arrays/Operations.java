package ch01.arrays;

public class Operations {
    public static void main(String[] args) {
        Operations op = new Operations();
        int[] sample = {5,3,6,8,4,2};
        System.out.println(searchUnsortedArray(sample, sample.length, 12));

        int[] insertValue = new int[5];
        insertValue[0] = 5;
        insertValue[1] = 10;
        insertValue[2] = 20;

        int val = insertValueOnArray(insertValue, 3, 7, 5, 2);
    }

    private static void print(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    private static int searchUnsortedArray(int[] array, int size, int value){
        for(int i = 0; i < size; i++){
            if(array[i] == value){
                return 1;
            }
        }
        return -1;
    }

    private static int insertValueOnArray(int[] array, int size, int value, int capacity, int pos){
        if(size == capacity)
            return size;
        System.out.println("Original Array");
        print(array);
        int idx = pos - 1;
        for(int i = size - 1; i >= idx; i--){
            array[i + 1] = array[i];
        }
        array[idx] = value;
        print(array);
        return size+1;
    }
}
