package org.example;

import com.fasterxml.jackson.xml.XmlMapper;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;

public class Xml implements Serializer<User> {
    private XmlMapper mapper;

    public Xml() {
        mapper = new XmlMapper();
    }
    @Override
    public void writeObject(String fileName, User object) throws IOException {
        try {
            mapper.writeValue(new File(fileName), object);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public User readObject(String fileName) throws IOException {
        try {
            var res = mapper.readValue(Paths.get(fileName).toFile(), User.class);
            return res;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
