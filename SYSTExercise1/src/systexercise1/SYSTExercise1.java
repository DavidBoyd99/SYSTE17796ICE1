
package systexercise1;


public class SYSTExercise1 {

    
    public static void main(String[] args) {
        
        int[] grades = {80, 67, 95, 72, 79, 60, -19, 90, 81, 70};
        
        System.out.println(calcAvg(grades));        
    }
    
    public static int calcAvg(int[] x)
    {
        
        int count = 0;
        int highest = x[0];
        int total = 0;
        for(int i = 0; i < x.length; i++)
        {
            if (x[i] >= 0)
            {
                count++;
                total += x[i];
                if (x[i] > highest)
                {
                    highest = x[i];
                }
            }
            
        }
        return total / count;
    }
    
}
