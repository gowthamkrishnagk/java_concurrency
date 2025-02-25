
public class Client {
public static void main(String[] args) {
	HelloworldPrinter p=new HelloworldPrinter();
	Thread t=new Thread(p);
	t.start();
}
}
