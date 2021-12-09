import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;
public class testSelectionSort {
@Test
public void test() {
testMixed();
testDuplicates();
}
    public testSelectionSort() {
    }


    public void testMixed(){
    	int[] arr = new int[5];
        arr[0] = 0;
        arr[1] = -9;
        arr[2] = 7;
        arr[3] = 10;
        arr[4] = -2;

        int[] Sortedarr = new int[5];
        Sortedarr[0] = -9;
        Sortedarr[1] = -2;
        Sortedarr[2] = 0;
        Sortedarr[3] = 7;
        Sortedarr[4] = 10;
        /** Test data contains with both positive, negative and zeros **/
        SelectionSort x= new SelectionSort();
        x.basicSelectionSort(arr);
         for(int i=0;i<5;i++) {
         assert(arr[i]==Sortedarr[i]);
         }
    }

    public void testDuplicates(){
    	int[] arr = new int[5];
        arr[0] = 2;
        arr[1] = 10;
        arr[2] = -7;
        arr[3] = 2;
        arr[4] = -7;

        int[] Sortedarr = new int[5];
        Sortedarr[0] = -7;
        Sortedarr[1] = -7;
        Sortedarr[2] = 2;
        Sortedarr[3] = 2;
        Sortedarr[4] = 10;
        /** Test data contains duplicates **/
        SelectionSort x= new SelectionSort();
        x.basicSelectionSort(arr);
         for(int i=0;i<5;i++) {
         assert(arr[i]==Sortedarr[i]);
         }
    }
}
