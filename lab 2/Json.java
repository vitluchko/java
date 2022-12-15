package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;

public class Json implements Serializer<User> {
    private ObjectMapper objectMapper;

    public Json() {
        objectMapper = new ObjectMapper();
    }

    @Override
    public void writeObject(String fileName, User object) throws IOException {
        try {
            objectMapper.writeValue(new File(fileName), object);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public User readObject(String fileName) throws IOException {
        try {
            var res = objectMapper.readValue(Paths.get(fileName).toFile(), User.class);
            return res;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
