class Cat {

    // write static and instance variables
    String name;
    int age;
    static int counter = 0;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        counter++;
        if (counter > 5) {
            System.out.println("You have too many cats");
        }



        // implement the constructor
        // do not forget to check the number of cats
    }

    public static int getNumberOfCats() {
        return counter;
        // implement the static method
    }
}