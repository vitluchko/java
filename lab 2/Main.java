package org.example;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        User user = new UserBuilderImplementation()
                .setName("Vladislav")
                .setIdCode("12345")
                .setCountry("Australia")
                .build();

        new User();
        User user2;

        Serializer<User>s = new Json();
        String fileName = "D:\\User.json";
        s.writeObject(fileName, user);
        user2=s.readObject(fileName);
        System.out.println(user2.toString());

        s = new Xml();
        fileName = "D:\\User.xml";
        s.writeObject(fileName, user);
        user2 = s.readObject(fileName);
        System.out.println(user2.toString());

        s = new Txt();
        fileName = "D:\\User.txt";
        s.writeObject(fileName, user);
        user2 = s.readObject(fileName);
        System.out.println(user2.toString());
    }
}
