package org.example;

import java.io.*;

public class Txt implements Serializer<User> {
    @Override
    public void writeObject(String fileName, User object) throws IOException {
        try (FileWriter fos = new FileWriter(fileName)) {
            fos.write(object.toStr());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public User readObject(String fileName) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        StringBuilder sb = new StringBuilder();
        String line = br.readLine();

        while (line != null) {
            sb.append(line);
            sb.append(System.lineSeparator());
            line = br.readLine();
        }

        String objectLine = sb.toString();
        return User.toObject(objectLine);
    }
}
