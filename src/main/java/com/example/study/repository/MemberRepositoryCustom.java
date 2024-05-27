package com.example.study.repository;

import com.example.study.entity.Member;

import java.util.List;

public interface MemberRepositoryCustom {

    // JPA 아님!! 상속 안받았음!
    List<Member> findByName(String name);
}