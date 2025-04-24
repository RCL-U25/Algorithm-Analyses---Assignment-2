public class InsertionSort implements SortingAlgorithm
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

        for (int p = 1; p < n; ++p)
        {
            int tmp = array[p];
            int j;
            for (j = p; j > 0 && tmp < array[j - 1];j--)
            {
                array[j] = array[j - 1];

            }
            array[j] = tmp;
        }
        return array;
    }
}
