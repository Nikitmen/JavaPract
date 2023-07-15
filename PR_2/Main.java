package sem2.PR1;

import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Human t1 = new Human(22,95,"Иван","Гусонович","22.05.2000");
        Human t2 = new Human(12,55,"Иган","Вайт","29.02.2002");
        Human t3 = new Human(102,25,"Иаан","Гадалов","29.01.1901");
        List<Human> list = Arrays.asList(t1, t2, t3);
        String name1 = String.valueOf(list.get(0));
        String name2 = String.valueOf(list.get(1));
        String name3 = String.valueOf(list.get(2));
        String name11 = null;
        String name22 = null;
        String name33 = null;
        int last3 = 0;
        int zxc1 = 3;
        int zxc2 = 3;
        int zxc3 = 3;
        if (name1.substring(37, 38).equals(" ")){
            name1 = name1.substring(33,38);
        }
        else {
            name1 = name1.substring(33,40);
        }
        if (name2.substring(37, 38).equals(" ")){
            name2 = name2.substring(33,38);
        }
        else {
            name2 = name2.substring(33,40);
        }
        if (name3.substring(37, 38).equals(" ")){
            name3 = name3.substring(33,38);
            last3 = name3.length() - 2;
        }
        else {
            name3 = name3.substring(33,40);
            last3 = name3.length() - 1;
        }
        int last1 = name1.length() - 2;
        int last2 = name2.length() - 2;
        for (int i = 0; i < 3; i++) {
            if(name1.substring(last1).equals(name2.substring(last2))){
                last1 = name1.length() - zxc1;
                last2 = name2.length() - zxc1;
                name11 = name1.substring(last1,last1 + 1);
                name22 = name2.substring(last2,last2 + 1);
                zxc1 +=1;
            }
            else{
                name11 = name1.substring(last1,last1 + 1);
            }
            if(name1.substring(last1).equals(name3.substring(last3))){
                last1 = name1.length() - zxc3;
                last3 = name3.length() - zxc3;
                name11 = name1.substring(last1,last1 + 1);
                name33 = name3.substring(last3,last3 + 1);
                zxc3 +=1;
            }
            else{
                name22 = name2.substring(last2,last2 + 1);
            }
            if(name2.substring(last2).equals(name3.substring(last3))){
                last2 = name2.length() - zxc2;
                last3 = name3.length() - zxc2;
                name22 = name2.substring(last2,last2 + 1);
                name33 = name3.substring(last3,last3 + 1);
                zxc2 +=1;
            }
            else {
                name33 = name3.substring(last3,last3 + 1);
            }
        }
        Human newt1 = new Human(22,95,name1,name11,"Гусонович","22.05.2000");
        Human newt2 = new Human(12,55,name2,name22,"Вайт","29.02.2002");
        Human newt3 = new Human(102,25,name3,name33,"Гадалов","29.01.1901");
        List<Human> list2 = Arrays.asList(newt1, newt2, newt3);
        Stream<Human> stream = list.stream();
        Stream<Human> stream2 = list.stream();
        Stream<Human> stream3 = list2.stream();
        Stream<Human> stream4 = list.stream();
//        stream.filter(Human::check).sorted(Comparator.comparingInt(Human::getAge)).forEach(System.out::println);
//        stream2.forEach(Human::yvel);
        stream3.sorted(Comparator.comparing(Human::name)).forEach(System.out::println);
//        stream4.forEach(Human::sum);
    }
    static void sorta(){

    }
}
