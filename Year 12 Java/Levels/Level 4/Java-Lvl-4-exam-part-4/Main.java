class Main {
    public static void main(String[] args) {

            String num = "13579";

    for (int loop = 0; loop!=5; loop++)
    {
        if (loop == 0)
        {
            System.out.println((num.charAt(loop))+" - - - -");
        }
        else if (loop == 1)
        {
            System.out.println("- "+(num.charAt(loop))+" - - -");
        }
        else if (loop == 2)
        {
            System.out.println("- - "+(num.charAt(loop))+" - -");
        }
        else if (loop == 3)
        {
            System.out.println("- - - "+(num.charAt(loop))+" -");
        }
        else if (loop == 4)
        {
            System.out.println("- - - - "+(num.charAt(loop)));
        }
        else
        {
            break;
        }
        
    }
    }
}