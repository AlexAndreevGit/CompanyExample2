package common;

import Entities.BasePerson;
import Entities.FullTimeEmploy;
import Entities.StudentEmploy;

public class Main {
    public static void main(String[] args) {

        BasePerson fullTimeEmploy = new FullTimeEmploy("Ivan","Georgiev",35);
        BasePerson student1= new StudentEmploy("Peter","Ivanov",25, fullTimeEmploy);



    }
}