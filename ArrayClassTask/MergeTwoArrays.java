import java.util.Arrays;
public class MergeTwoArrays{
    public static void main(String[] args){
        int[] firstArray = {3, 1, 5, 7};
        int[] secondArray = {0, 8, 2};

        int[] mergeArrayResult = mergeTwoArrays(firstArray, secondArray);
        System.out.println(Arrays.toString(mergeArrayResult));
    }

    public static int[] mergeTwoArrays(int[] numbers1, int[] numbers2){

        int mergeArraySize = numbers1.length + numbers2.length;
        int[] mergeArray = new int[mergeArraySize];
//        int[] mergeArray = new int[numbers1.length + numbers2.length];
        int index = 0;
        
        for(int count = 0; count < numbers1.length; count++){
            mergeArray[index++] = numbers1[count];
        }
        for(int count = 0; count < numbers2.length; count++){
            mergeArray[index++] = numbers2[count];
        }
        return mergeArray;
    }
}
