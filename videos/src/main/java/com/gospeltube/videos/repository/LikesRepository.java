package com.gospeltube.videos.repository;

import com.gospeltube.videos.entity.Likes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LikesRepository extends JpaRepository<Likes, Long> {

}