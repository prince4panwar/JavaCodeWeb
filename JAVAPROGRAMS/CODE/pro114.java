
class pro114
{
    public static void main(String arg[])throws java.io.IOException
    {
        System.out.println("\nProgram to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros.\n");
        java.io.BufferedReader input = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
        int positive=0, negative=0, zeros=0;

        Double num;
        String a="";
        System.out.print("Enter numbers, to quit enter q : ");
        a=input.readLine();
        String[] numbers = a.split(" ");
        for (String numberStr : numbers){
            if (numberStr.equals("q")) break;

            try{
               num= Double.parseDouble(numberStr); 
            }
            catch(java.lang.NumberFormatException e){
               continue;
            }

            if(num<0) negative ++;
            else if (num>0) positive++;
            else zeros++;
        }

    System.out.println("The number of positive numbers were =  "+positive);
    System.out.println("The number of negative numbers were = "+negative);
    System.out.println("The number of zeros were =  "+zeros);
    }
}