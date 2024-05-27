package com.example.study.repository;
import com.example.study.entity.Member;
import java.util.List;
public interface MemberRepositoryCustom {
    // JPA꺼 아니에요!!! 상속 안받았어요!!!
    List<Member> findByName(String name);

    List<Member> findUser(String nameParam, Integer ageParam);

}