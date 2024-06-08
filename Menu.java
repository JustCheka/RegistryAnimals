import java.util.Scanner;

public class Menu {
    Registry registry = new Registry();
    public void Start(){
        boolean flag = true;
        while(flag){

            registry.printListOfAnimals();
            System.out.println("1 - добавить животного " +
                    "2 - напечатать команды животного " +
                    "3 - добавить команды животному " +
                    "4 - напечатать информацию о животном  " +
                    "5 - выход");

            Scanner scanner = new Scanner(System.in);
            int choose = scanner.nextInt();
            int index = 0;
            switch (choose){
                case 1:
                    registry.addAnimal();
                    break;
                case 2:

                    System.out.println("Какое животное выбираем?");
                    index = scanner.nextInt() - 1;
                    registry.printCommands(registry.getAnimal(index));
                    break;
                case 3:
                    System.out.println("Какое животное выбираем? (по порядковому номеру) ");
                    index = scanner.nextInt() - 1;
                    registry.addCommands(registry.getAnimal(index));
                    break;
                case 4:
                    System.out.println("Какое животное выбираем? (по порядковому номеру)");
                    index = scanner.nextInt() - 1;
                    registry.getAnimal(index).printInfo();
                    break;
                case 5:
                    flag = false;
                    break;
//                    for (int i = 0; i < registry.getSizeOfAnimals(); i++) {
//                        registry.getAnimal(i);
//                    }

                default:
                    break;
            }
        }

    }
}
