package com.example.board.repository;

import com.example.board.dto.BoardDTO;
import lombok.RequiredArgsConstructor;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class BoardRepository {
    private final SqlSessionTemplate sql;

    public List<BoardDTO> findAll() {
        return sql.selectList("Board.findAll");
    }
    public BoardDTO findById(Long id) {
        return sql.selectOne("Board.findById", id);
    }

    public void save(BoardDTO boardDto) {
        sql.insert("Board.save", boardDto);
    }

    public void update(BoardDTO boardDto) {
        sql.update("Board.update", boardDto);
    }

    public void delete(Long id) {
        sql.delete("Board.delete", id);
    }
}
