package com.gospeltube.videos.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "video_likes")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Likes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "video_id")
    private Videos video;
    @Column(name = "user_id")
    private Long userId;
}
