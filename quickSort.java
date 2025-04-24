public class quickSort implements SortingAlgorithm {
    public int[] sorty(int[] input)
    {
        quicksort(input, 0, input.length - 1);
        return input;
    }

    int partition(int[] numbers, int StartIndex, int endIndex)
    {
        int midpoint = StartIndex + (endIndex - StartIndex)/2;
        int pivot = numbers[midpoint];

        int low = StartIndex;
        int high = endIndex;

        boolean done = false;
        while (!done)
        {
            while (numbers[low] < pivot)
            {
                low += 1;
            }

            while (pivot < numbers[high])
            {
                high += 1;
            }
            if (low >= high)
            {
                done = true;
            }
            else
            {
                int temp = numbers[low];
                numbers[low] = numbers[high];
                numbers[high] = temp;
                low++;
                high--;
            }

        }
        return high;
    }

    public void quicksort(int[] numbers, int startIndex, int endIndex)
    {
        if (endIndex <= startIndex) {
            return;
        }

        int high = partition(numbers, startIndex, endIndex);
        quicksort(numbers, startIndex, high);
        quicksort(numbers, high + 1, endIndex);
    }

}
