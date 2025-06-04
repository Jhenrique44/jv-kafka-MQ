package com.microservices.email.domain;

import java.time.LocalDateTime;

import com.microservices.email.enums.EmailStatus;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Table(name = "TB_email")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmailModel {
    
    private String emailId;
    private String userId;
    private String emailFrom;
    private String emailTo;
    private String emailSubject;
    
    @Column(columnDefinition = "BODY")
    private String Body;
    private LocalDateTime sendDateEmail;
    private EmailStatus statusEmail;

}
