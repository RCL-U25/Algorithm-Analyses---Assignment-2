public class BubbleSort implements SortingAlgorithm
{
    public int[] sorty(int[] input) {
        int n = input.length;
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
        {
            arr[i] = input[i];
        }

        for (int i = 0; i < (n - 1); i++)
        {
            for (int j = 0; j < (n - i - 1); j++)
            {
                if (arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    
}
