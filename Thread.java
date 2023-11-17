import java.util.concurrent.Callable;

public class Thread implements Callable<Integer>
{
    @Override
    public Integer call() throws Exception {

        
        int count = 0;
        for(int i = 0; i < 1000000; i++)
        {
            count++;
        }
        return count;
        
    }


}