package sem2.PR1;


public class Human {
    private  int age,weight,c = 0;
    private int[] a = new int[3];
    private String firstName,lastName,birthDate;
    private String bykv = null;

    public Human(int age,int weight,String firstName,String lastName,String birthDate){
        this.age = age;
        this.weight = weight;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }

    public Human(int age,int weight,String bykv,String firstName,String lastName,String birthDate){
        this.age = age;
        this.weight = weight;
        this.bykv = bykv;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }

    public int getAge() {
        return age;
    }


    public String getFirstName() {
        return firstName;
    }

    public boolean check(){
        return age > 20;
    }
    public String name() {
        return firstName;
    }

    public void yvel() {
        System.out.println(age + 3);
    }

    public void sum(){
        if (age < 20){
            a[0] = age;
        }
        if (age > 30){
            a[1] = age;
            age = (a[0] + a[1] + a[2]) / 3;
            System.out.println(age);
        }
        else  a[2] = age;
    }

    @Override
    public String toString() {
        if(bykv == null){
            return "Возраст типочка: " + age + " Вес: "+ weight + " Имя: " + firstName + " Фамилия: " + lastName + " Дата рождения: " + birthDate;
        }
        else{
            return "Возраст типочка: " + age + " Вес: "+ weight + " Имя: " + bykv + " Фамилия: " + lastName + " Дата рождения: " + birthDate;
        }

    }
}
