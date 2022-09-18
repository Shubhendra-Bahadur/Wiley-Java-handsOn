/*solve(task)
*split task into subtasks
*solve(each subtasks)
*wait for all task to complete
*join all indivdual tasks or sub tasks
*return result
*/
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
public class Fibonacci extends ForkJoinTask<Integer> {

    
  
  	public static void main(String[] args) {
        Fibonacci task = new Fibonacci();
        System.out.println(new ForkJoinPool().invoke(task));
    }

	@Override
	protected boolean exec() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Integer getRawResult() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected void setRawResult(Integer arg0) {
		// TODO Auto-generated method stub
		
	}
}