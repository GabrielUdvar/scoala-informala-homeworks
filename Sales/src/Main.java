public class Main {

    public static void main(String[] args) {
        int SalesNumber[] ={3,60,35,2,45};
        int SalesQuota [] = {10,10,10,10,10};
        String RepName [] = {"Ion", "Matache", "Jesus", "Zoli", "Jiji"};

        int TotalRepSales [] = totalSales(SalesNumber, SalesQuota); //calls the function for calculating the Total Sales
        int SortedSales [] = bubbleSort(totalSales(SalesNumber, SalesQuota)); //calls the function for sorting the sales RepName,

        System.out.println("Sales before sorting"); //prints out Total Sales before sort
        for(int i=0; i < TotalRepSales.length; i++){
            System.out.print(TotalRepSales[i] + " ");
        }
        System.out.println();

        System.out.println("Total Sales after sorting"); //prints out Total Sales after sort
        for(int i=0; i < SortedSales.length; i++){
            System.out.print(SortedSales[i] + " ");
        }

    }
    //Bubble sort algorithm//
    //verifies an array of strings and sorts them in descending order//
    private static int[] bubbleSort( int[] values) { // to implement repIndex to sort out names
        int n = values.length;
        int temp = 0;
        int repIndex = 0;
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(values[j-1] < values[j]){
                    //swap elements
                    temp = values[j-1];
                    values[j-1] = values[j];
                    values[j] = temp;
                }
            }
        }
        return values;
    }

    //total sales calculator//
    //calculates each Sales Rep total sales by multiplying sales qouta with sales number//
    private static int[] totalSales (int[] values1,int[] values2){
        int TotalSales[] = new int[values1.length];
        for (int i=0; i<values1.length; i++){
            TotalSales[i] = values1[i]*values2[i];}
        return TotalSales;
    }
    }