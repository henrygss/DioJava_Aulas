public class Continue 
{
    public static void main(String[] args) 
    {
        for (int i = 0; i < 30; i++)
        {
            if (i % 2 == 0) //pula a iteração se i for par
            {
                continue;
            }

            System.out.println(i);
        }    
    }    
}
