package com.wordsalad.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wordsalad.entity.Postinfo;

public interface PostRepository extends JpaRepository<Postinfo, Integer> {

}
