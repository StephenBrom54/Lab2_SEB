
public class TestImplementation {

	public static void main(String[] args) {
		Wizard wizard1 = new Wizard("Gandalf");
		System.out.println(wizard1);

		wizard1.setKey(1234);
		System.out.println(wizard1);

		wizard1.lock(1234);
		System.out.println(wizard1);

		wizard1.takeDamage(10);
		System.out.println(wizard1);

		wizard1.unlock(1234);
		System.out.println(wizard1);

		wizard1.takeDamage(10);
		System.out.println(wizard1);

	}

}
