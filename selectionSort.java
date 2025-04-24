public class selectionSort implements SortingAlgorithm
{
    @Override
    public int[] sorty(int[] input)
    {
        int n = input.length;
        int[] array = new int[n];

        for (int i = 0; i < n; i++)
        {
            array[i] = input[i];
        }

        for (int i = 0; i < n; i++) {
            int minIndex = i;
            for (int j = i; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }

        return array;
    }
}
