package models;

import lombok.Data;
import lombok.NonNull;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
public class User {

    @Id
    private String id;
    @NonNull
    private String name;
    @NonNull
    private String email;
    @NonNull
    private int age;
    @NonNull
    private String phoneNumber;
}
