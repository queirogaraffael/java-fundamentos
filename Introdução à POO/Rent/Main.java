import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

		System.out.println("How many rooms will be rented? ");
		int quantityStudent = sc.nextInt();

		Rent[] rent = new Rent[10];

		// sc.nextLine();

		for (int i = 1; i <= quantityStudent; i++) {
			System.out.printf("Rent #" + i + ":");
			System.out.println();
			sc.nextLine();
			System.out.println("Name: ");
			String name = sc.nextLine();
			System.out.println("Email: ");
			String email = sc.nextLine();
			System.out.println("Room: ");
			int room = sc.nextInt();

			rent[room] = new Rent(name, email);
		}

		System.out.println();
		System.out.println("Busy rooms: ");

		for (int i = 0; i < 10; i++) {
			if (rent[i] != null) {
				System.out.println(i +": "+ rent[i].getName() + ", " + rent[i].getEmail());
				// System.out.println(i + ":" + rent[i]);
			}
		}
		sc.close();
  }
}