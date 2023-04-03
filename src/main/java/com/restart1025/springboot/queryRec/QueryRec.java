package com.restart1025.springboot.queryRec;

import lombok.Data;
import lombok.Getter;

import java.io.Serializable;

@Data
public class QueryRec implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;

    @Getter
    private boolean undone;

    @Getter
    private boolean expired;
}
