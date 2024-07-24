package com.gospeltube.videos.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
@Entity
@Table(name = "comments")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Comments {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(columnDefinition = "TEXT")
    private String comment;
    @Column(columnDefinition = "TIMESTAMP")
    private LocalDateTime time;
    @Column(name = "total_likes")
    private Long totalLikes;
    @Column( name = "user_id")
    private Long userId;
    @JsonIgnore
    @ManyToOne()
    @JoinColumn(name = "video_id")
    private Videos video;
}
