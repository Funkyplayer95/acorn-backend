package com.wordsalad.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wordsalad.entity.Cmtinfo;

public interface CmtRepository extends JpaRepository<Cmtinfo, Integer> {
}
