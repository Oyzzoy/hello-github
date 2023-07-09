package org.example;

/**
 * @author shkstart
 * @create ${YEAR}-${MONTH}-${DAY} ${TIME}
 */
public class Main {

    public void main(String[] args) {
        System.out.println("Hello world!");
        User user = new User();
        user.age=11;

    }
    static class User{
        static int year=10;
        String name;
        int age=10;
        public User(){

        }
        public User(int age){
            this.age=age;
        }
    }
}