public class SelectionSort
{
    public static void sort(int[] array)
    {
        //need index vs just minimum bc we're swapping elements by index
        int minimumIndex, temp;
        //use boolean to see if array is already sorted to begin with
        boolean sorted;


        for (int i = 0; i < array.length; ++i)
        {
            minimumIndex = i;

            for (int j = i + 1; j < array.length; ++j)
            {
                if(array[j] < array[minimumIndex])
                {  //if current index < minIndex, make current the new minIndex
                    minimumIndex = j;
                }
            }
            //swap arr[i] with arr[minIndex]
                temp = array[i];
                array[i] = array[minimumIndex];
                array[minimumIndex] = temp;
            }
        }
    }

