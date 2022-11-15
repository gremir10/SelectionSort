import java.util.Random;

public class Main
{
    public static void main(String[] args)
    {
                Random rnd = new Random();

                //create array to send to BubbleSort
                int[] myArray;
                myArray = new int[10];

                //fill array
                for (int i = 0; i < 10; i++)
                {
                    myArray[i] = rnd.nextInt(100);
                }

                SelectionSort.sort(myArray);

                System.out.println("Selection sorted array: ");
                for (int i = 0; i < 10; i++)
                {
                    System.out.println(myArray[i]);
                }

            }
        }

