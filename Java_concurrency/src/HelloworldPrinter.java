import java.util.*;
public class HelloworldPrinter implements Runnable
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
	
		print();
	}
	public void print() {
		for(int i=100;i<200;i++) {
			System.out.print("Thread name: "+Thread.currentThread().getName()+" ");
			System.out.println(i);}
	}

}
