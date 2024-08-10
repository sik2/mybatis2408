package com.example.board.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
public class BoardDTO {
    private Long id;
    private String subject;
    private String content;
    private String createdDate;
    private String modifiedDate;
}
