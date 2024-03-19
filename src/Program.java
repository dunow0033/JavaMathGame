
public class Program {
	public static void main(String args[])
	{
		String name = Helpers.GetName();
		
		Menu menu = new Menu();
		menu.showMenu(name);
	}
}
