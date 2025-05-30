import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class practice
{
    public static void main(String[] args)
    {
        int count = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length of the string");
        int len = in.nextInt();
        int[] arr = new int[len];
        for(int i=0; i<len; i++)
        {
            arr[i] = in.nextInt();
        }


                                                                            /*CAPTAIN NUMBER IN ARRAY*/
       /*  List<Integer> resultList = new ArrayList<>();
        for(int j=0; j<len; j++)
        {
            count = 0;
            for(int k=j+1; k<len; k++)
            {
                if(arr[j] > arr[k])
                {
                    count++;
                }
                else
                {
                    break;
                }
            }
            if(count == len - j - 1)
            {
                resultList.add(arr[j]);
            }
        }
        int[] arr1 = resultList.stream().mapToInt(i -> i).toArray();
        System.out.println(Arrays.toString(arr1));*/




                                                             /*SECOND GREATEST NUMBER IN AN ARRAY*/

       /*  int max = 0;
        int max1 = 0;
        for(int a=0; a<len; a++)
        {
            if(max < arr[a])
            {
                max = arr[a];
            }
        }

        for(int b=0; b<len; b++)
        {
            if(max1 < arr[b] && arr[b] < max)
            {
                max1 = arr[b];
            }
        }
        System.out.println(max1);*/


                                                                         /*MOVING ZEROS TO LAST*/
          
          /*   int[] zer = new int[len];
            for(int a = 0; a < len; a++)
            {
                if(arr[a] != 0)
                {
                    zer[count] = arr[a];
                    count++;
                }
            }
            System.out.println(Arrays.toString(zer));*/


                                                                              /*ALPHANUMERIC STRING ADITION */
                   

          /*   String str = "1ab40b4";
            int sum =0;

            for(int a=0; a<str.length(); a++)
            {
                char ch = str.charAt(a);

                if(Character.isDigit(ch))
                {
                    sum += Character.getNumericValue(ch);
                }
            }
            System.out.println(sum);*/

                                                       /* MOST REPEATING ELEMENT */
            /*for(int i=0; i<len; i++)
            {
                for(int j=i+1; j<len; j++)
                {
                    if(arr[i] == arr[j])
                    {
                        count++;
                    }
                }
                if(max < count)
                    {
                       max = arr[i];
                    }
                    count = 0;
            }
            System.out.println(max);
            */
    }
}
