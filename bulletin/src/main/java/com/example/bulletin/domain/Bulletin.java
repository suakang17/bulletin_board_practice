package com.example.bulletin.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Bulletin {
    private Long bulletinId;
    private String title;
    private String content;
    private String name;
    private LocalDateTime createDate;
    private int read;
    private Long memberId;
}
