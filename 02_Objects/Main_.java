class Person implements Cloneable{

    String name;
    int age;

    public Person(String name, int age){
        super(); // get both Object and Cloneable
        this.name = name;
        this.age = age;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString(){
        return "hello" + name;
    }
}

class Main_{
    public static void main(String[] args) throws CloneNotSupportedException {

        Person p1 = new Person("Rehan", 20);
        Person p2 = (Person) p1.clone();
        System.out.println(p1);
        System.out.println(p2);

        System.out.println(p2.toString()); // Override the actual toString of Object
        

    }
}
    