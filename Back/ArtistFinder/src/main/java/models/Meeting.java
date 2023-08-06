package models;

import lombok.Data;
import lombok.NonNull;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
public class Meeting {

    @Id
    private String id;
    @NonNull
    private User user;
    @NonNull
    private String startDate;
    @NonNull
    private String endDate;
}
