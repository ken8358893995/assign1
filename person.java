class Person {
    // Instance variables
    String name;
    int age;

    // Constructor with arguments (Parameterized Constructor)
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display the values of the person
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}