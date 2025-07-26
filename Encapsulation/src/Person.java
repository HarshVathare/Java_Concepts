public class Person {
    private String name;
    private int age;
    private String Gender;
    private String  Mobile_no;

    public Person(String name, int age, String gender,String Mobile_no) {
        this.name = name;
        this.age = age;
        this.Gender = gender;
        this.Mobile_no = Mobile_no;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean setAge(int age) {
        if(age >= 0 && age <= 100){
            this.age = age;
            return true;
        }
        else {
            return false;
        }
    }

    public void setMobile_no(String mobile_no) {
        this.Mobile_no = mobile_no;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", Gender='" + Gender + '\'' +
                ", Mobile No='" + Mobile_no + '\'' +
                '}';
    }
}
