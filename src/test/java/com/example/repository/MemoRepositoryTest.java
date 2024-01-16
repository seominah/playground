package com.example.repository;

import com.example.entity.Memo;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.stream.IntStream;

@SpringBootTest
public class MemoRepositoryTest {
    @Autowired
    MemoRepository memoRepository;

    @Test
    public void testClass() {
        System.out.println(memoRepository.getClass().getName());
    }

    @Test
    @DisplayName("등록 테스트")
    public void testInsertDummies() {
        IntStream.rangeClosed(1, 100).forEach(value -> {
            Memo memo = Memo.builder().memoText("Memo Test " + value).build();
            memoRepository.save(memo);
        });
    }
}
