import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Cars car1 = new Cars();
        Cars car2 = new Cars();
        Cars car3 = new Cars();
        Cars car4 = new Cars();
        Cars car5 = new Cars();

        Bikes bike1 = new Bikes();
        Bikes bike2 = new Bikes();
        Bikes bike3 = new Bikes();
        Bikes bike4 = new Bikes();
        Bikes bike5 = new Bikes();

        car1.setName("Lamborghini");
        car2.setName("Ferrari");
        car3.setName("Bugatti");
        car4.setName("Pagani");
        car5.setName("Porsche");

        bike1.setName("Harley Davidson");
        bike2.setName("Ducati");
        bike3.setName("Suzuki");
        bike4.setName("Ecosse");
        bike5.setName("Yamaha");

        bike1.setCost("$130,000");
        bike2.setCost("$230,000");
        bike3.setCost("300,000");
        bike4.setCost("200,000");
        bike5.setCost("500,000");

        car1.setCost("603,000");
        car2.setCost("350,000");
        car3.setCost("800,000");
        car4.setCost("150,000");
        car5.setCost("200,000");

        System.out.println("What do you want to buy?");
        System.out.println("1. Bikes");
        System.out.println("2. Cars");

        int choice;
        System.out.println("Enter your choice: ");
        choice = scanner.nextInt();

        if (choice == 1){
            System.out.println("We have 5 Bike models avaliable: ");
            System.out.println("1. Harley Davidson");
            System.out.println("2. Ducati");
            System.out.println("3. Suzuki");
            System.out.println("4. Pagani");
            System.out.println("5. Yamaha");

            System.out.println("Enter your choice: ");

            int secondChoice;
            secondChoice = scanner.nextInt();

            if (secondChoice == 1) {
                System.out.println("The cost of Harley Davidson is " + bike1.getCost());
            } else if (secondChoice == 2) {
                System.out.println("The cost of the Ducati is " + bike2.getCost());
            } else if (secondChoice == 3) {
                System.out.println("The cost of the Suzuki is " + bike3.getCost());
            } else if (secondChoice == 4) {
                System.out.println("The cost of the Pagani is " + bike4.getCost());
            } else if (secondChoice == 5) {
                System.out.println("The cost of the Yamaha is " + bike5.getCost());
            } else {
                System.out.println("Choose option between 1-5");
                secondChoice = scanner.nextInt();

                System.out.println("You picke the " + secondChoice);
            }
        } else if (choice == 2) {
            System.out.println("We have 5 Car models available:");
            System.out.println("1. Lamborghini");
            System.out.println("2. Ferrari");
            System.out.println("3. Bugati");
            System.out.println("4. Ecosse");
            System.out.println("5. Porsche");

            System.out.println("Enter the choice:");

            int carChoice;
            carChoice = scanner.nextInt();

            if (carChoice == 1) {
                System.out.println("The cost of the Lamborghini is " + car1.getCost());
            }else if (carChoice == 2) {
                System.out.println("The cost of the Ferrari is " + car2.getCost());
            } else if (carChoice == 3) {
                System.out.println("The cost of the Bugati is " + car3.getCost());
            } else if (carChoice == 4) {
                System.out.println("The cost of the Ecosse is " + car4.getCost());
            } else if (carChoice == 5) {
                System.out.println("The cost of the Porsche is " + car5.getCost());
            } else {
                System.out.println("Please choose between 1-5");
                carChoice = scanner.nextInt();

                System.out.println("You picked the " + carChoice);
            }
        }
        else {
            System.out.println("Please enter the choice of 1 or 2");

            choice = scanner.nextInt();
        }
    }
}
