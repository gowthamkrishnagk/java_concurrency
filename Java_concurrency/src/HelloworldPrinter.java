import java.util.*;
public class HelloworldPrinter implements Runnable
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		print();
	}
	public void print() {
		for(int i=0;i<100;i++)
			System.out.println(i);
	}

}
