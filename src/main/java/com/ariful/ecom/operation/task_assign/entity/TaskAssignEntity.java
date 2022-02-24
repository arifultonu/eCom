package com.ariful.ecom.operation.task_assign.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;

import java.util.Date;

import static javax.persistence.GenerationType.AUTO;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "task_create_assign")
public class TaskAssignEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String adminUserId;
    private String assignUserId;
    private int taskId;
    private String taskDetails;
    private String assignDate;
    private String dueDate;
    private String priorityId;
    private String taskStatusId;
}
