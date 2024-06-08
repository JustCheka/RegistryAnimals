import java.util.ArrayList;
import java.util.Scanner;

public class Registry {
    private ArrayList<Animal> animals = new ArrayList<>();

    public void addAnimal(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Что у вас за животное (" +
                "1 - собачка, " +
                "2 - кошка, " +
                "3 - хомяк, " +
                "4 - лошадь, " +
                "5 - верблюд, " +
                "6 - осел");
        int answer = scanner.nextInt();

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Имя животного? ");
        String name = scanner1.nextLine();
        System.out.println("Дата рождения ");
        String date = scanner1.nextLine();
        animals.add(createAnimal(name, date, answer));

    }

    public Animal createAnimal(String name, String date, int type){
        return switch (type) {
            case 1 -> new Dog(name, date);
            case 2 -> new Cat(name, date);
            case 3 -> new Hamster(name, date);
            case 4 -> new Horse(name, date);
            case 5 -> new Camel(name, date);
            case 6 -> new Donkey(name, date);
            default -> throw new RuntimeException();
        };
    }

    public void printCommands(Animal animal){

        System.out.println(animal.getCommands());
    }

    public void addCommands(Animal animal){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите новую команду ");
        String command = scanner.nextLine();
        animal.setCommands(command);
    }

    public void printListOfAnimals(){
        for (int i = 0; i < animals.size(); i++) {
            System.out.println(i + 1 + " " + animals.get(i).getName());
        }
    }

    public Animal getAnimal(int index){
        return animals.get(index);
    }

    public int getSizeOfAnimals(){
        return animals.size();
    }
}
