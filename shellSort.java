public class shellSort implements SortingAlgorithm
{
    @Override
    public int[] sorty(int[] input)
    {
        int n = input.length;

        int count = 0;

        for (int gap = n/2; gap > 0; gap /= 2)
        {
            count++;
        }

        int[] gaps = new int[count];

        for (int gap = n/2; gap > 0; gap /= 2)
        {
            gaps[count++] = gap;
        }

        shellSort(input, gaps);

        return input;
    }

    public void Interleaved_IS(int[] numbers, int startIndex, int gap) {
        for (int i = startIndex + gap; i < numbers.length; i += gap) {
            int j = i;
            while (j - gap >= startIndex && numbers[j] < numbers[j - gap]) {
                int temp = numbers[j];
                numbers[j] = numbers[j - gap];
                numbers[j - gap] = temp;
                j -= gap;
            }
        }
    }

    void shellSort(int[] numbers, int[] gapValues)
    {
        for (int g = 0; g < gapValues.length; g++)
        {
            for (int i = 0; i < gapValues[g]; i++)
            {
                Interleaved_IS(numbers, i, gapValues[g]);
            }
        }
    }



}
