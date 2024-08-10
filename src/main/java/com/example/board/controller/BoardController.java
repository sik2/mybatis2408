package com.example.board.controller;

import com.example.board.dto.BoardDTO;
import com.example.board.service.BoardService;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/v1/boards")
@RestController
@RequiredArgsConstructor
public class BoardController {
    private final BoardService boardService;

    @GetMapping("")
    public List<BoardDTO> findAllBoard() {
        return boardService.findAll();
    }

    @GetMapping("/{id}")
    public BoardDTO findBoard(@PathVariable("id") Long id) {
        return boardService.findById(id);
    }

    @Data
    public static class CreateBoardRequest {
        @NotBlank
        private String subject;
        @NotBlank
        private String content;
    }
    @PostMapping("")
    public String createBoard(@RequestBody CreateBoardRequest createBoardRequest) {
        try {
            boardService.create(createBoardRequest.getContent(), createBoardRequest.getSubject());
        } catch (Exception e) {
            System.out.println(e);
            return "게시글 등록 실패";
        }

        return "게시글 등록";
    }

    @DeleteMapping("/{id}")
    public String deleteBoard(@PathVariable("id") Long id) {
        try {
            boardService.delete(id);
        } catch (Exception e) {
            System.out.println(e);
            return String.format("%d 번 게시물 삭제 실패", id);
        }
        return String.format("%d 번 게시물 삭제", id);
    }

    @Data
    public static class ModifyBoardRequest {
        @NotBlank
        private String subject;
        @NotBlank
        private String content;
    }

    @PatchMapping("/{id}")
    public String modifyBoard(@PathVariable("id") Long id, @RequestBody ModifyBoardRequest modifyBoardRequest)  {
        try {
            boardService.modify(id, modifyBoardRequest.getContent(), modifyBoardRequest.getSubject());
        } catch (Exception e) {
            System.out.println(e);
            return "게시글 수정 실패";
        }

        return "게시글 수정";
    }
}
