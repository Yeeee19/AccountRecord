package com.restart1025.springboot.queryRec;

import com.restart1025.springboot.rec.Rec;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QueryRecRepositoryCustom {

    public List<Rec> queryRec(QueryRec queryRec);
}
