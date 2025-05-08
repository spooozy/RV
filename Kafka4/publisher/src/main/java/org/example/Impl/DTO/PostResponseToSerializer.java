package by.bsuir.dto;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.kafka.common.serialization.Deserializer;
import org.apache.kafka.common.serialization.Serializer;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Map;

public class PostResponseToSerializer implements Serializer<PostResponseTo>, Deserializer<PostResponseTo> {

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public void configure(Map<String, ?> configs, boolean isKey) {
    }

    @Override
    public byte[] serialize(String topic, PostResponseTo data) {
        try {
            System.out.println(objectMapper.writeValueAsString(data).getBytes(StandardCharsets.UTF_8));
            return objectMapper.writeValueAsString(data).getBytes(StandardCharsets.UTF_8);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public PostResponseTo deserialize(String topic, byte[] data) {
        try {
            System.out.println(objectMapper.readValue(data, PostRequestTo.class));
            return objectMapper.readValue(data, PostResponseTo.class);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public void close() {
    }
}
