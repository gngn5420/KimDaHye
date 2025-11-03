package com.four.animory.free;

import com.four.animory.AnimoryApplication;
import com.four.animory.domain.free.FreeBoard;
import com.four.animory.repository.free.FreeBoardRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = AnimoryApplication.class)
public class ServiceTest {
    @Autowired
    private FreeBoardRepository freeBoardRepository;

    @Test
    void insertFreeBoard() {
        FreeBoard freeBoard = FreeBoard.builder()
                .title("제목5")
                .content("내용5")
                .writer("유저5")
                .btype("정보")
                .build();
        freeBoardRepository.save(freeBoard);
    }
}
