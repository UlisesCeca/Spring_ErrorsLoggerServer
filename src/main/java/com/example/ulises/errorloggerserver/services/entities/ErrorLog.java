package com.example.ulises.errorloggerserver.services.entities;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "ErrorsLogs")
@Data
public class ErrorLog {
    private App app;
    private String trace;
    private String causedByUser;
    private Date datetime;
}
