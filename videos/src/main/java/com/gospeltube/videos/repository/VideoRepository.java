package com.gospeltube.videos.repository;

import com.gospeltube.videos.entity.Videos;
import org.springframework.data.jpa.repository.JpaRepository;


public interface VideoRepository extends JpaRepository<Videos, Long> {

}

