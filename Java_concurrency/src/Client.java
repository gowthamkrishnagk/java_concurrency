
public class Client {
	public void print() {
		for(int i=100;i<200;i++) {
			System.out.print("Thread name: "+Thread.currentThread().getName()+" ");
			System.out.println(i);}
	}
public static void main(String[] args) {
	Client c=new Client();

	HelloworldPrinter p=new HelloworldPrinter();
	Thread t=new Thread(p);
	t.start();
	c.print();
}
}
