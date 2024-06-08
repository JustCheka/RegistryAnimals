import java.util.ArrayList;

public class Pets extends Animal{


    public Pets(String name, String date) {
        super(name, date);
    }

    @Override
    public void printInfo() {
        System.out.println("Это домашнее животное");
        super.printInfo();
    }

    @Override
    public String toString() {
        return  "домашнее животное " +
                "имя = '" + super.getName() + '\'' +
                ", команды = " + super.getCommands() +
                ", дата рождения = '" + super.getBirth() + '\'' +
                '}';
    }
}