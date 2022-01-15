package abstractEx;

public class ComputerTest {
	
	public static void main(String[] args) {
		
		Computer c1 = new DeskTop();
		Computer c2 = new MyNoteBook();
		
		NoteBook c3 = new MyNoteBook();
		c1.display();
		c2.display();
	}

}
