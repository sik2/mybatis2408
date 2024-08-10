package com.example.board.service;

import com.example.board.dto.BoardDTO;
import com.example.board.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardService {
    private  final BoardRepository boardRepository;
    public List<BoardDTO> findAll() {
        return boardRepository.findAll();
    }

    public BoardDTO findById(Long id) {
        return boardRepository.findById(id);
    }

    public void save(BoardDTO boardDto) {
        boardRepository.save(boardDto);
    }

    public void delete(Long id) {
        boardRepository.delete(id);
    }

    public void create(String subject, String content) {
        BoardDTO boardDTO = new BoardDTO();
        boardDTO.setContent(subject);
        boardDTO.setSubject(content);
        boardRepository.save(boardDTO);
    }

    public void modify(Long id, String subject, String content) {
        BoardDTO boardDTO = boardRepository.findById(id);
        boardDTO.setContent(subject);
        boardDTO.setSubject(content);
        boardRepository.update(boardDTO);
    }
}
