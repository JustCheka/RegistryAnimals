public class PackAnimals extends Animal {
    public PackAnimals(String name, String date) {
        super(name, date);
    }

    @Override
    public void printInfo() {
        System.out.println("Это вьючное животное");
        super.printInfo();
    }

    @Override
    public String toString() {
        return  "вьючное животное " +
                "имя = '" + super.getName() + '\'' +
                ", команды = " + super.getCommands() +
                ", дата рождения = '" + super.getBirth() + '\'' +
                '}';
    }
}