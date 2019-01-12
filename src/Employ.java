/*
public class Employ {
    String name;
    int age;

    public Employ ( String name, int age){

        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public String tostring(){
        return "Jestem pracownikiem" + name + ", mam" + age + "lat/a";

    }
@Override
    public boolean equals(Object object) {

    if (this == object) {
        return true;
    }

    if (object == null) {
        return false;
    }

    if (getClass() != object.getClass()) {
        return false;
    }


    Employ employ = (Employ) object;

    if (this.name == null) {
        if (employ.name != null) {
            return false;
        } else if (this.name.equals(employ.name) && this.age == employ.age) {
            return true;
        }
        return false;

//        return this.name.equals(((Employ)object).name);
    }

*/
