package ro.tuc.pt._assig1;

public class mainClass {

	public static void main(String[] args) {
		
	View interfata=new View();
	@SuppressWarnings("unused")
	Controller controller=new Controller(interfata);
	interfata.setVisible(true);
	}
}
