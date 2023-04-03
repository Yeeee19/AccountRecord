package com.restart1025.springboot.queryRec;

import com.restart1025.springboot.rec.Rec;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Repository
public class QueryRecRepositoryImpl implements QueryRecRepositoryCustom {

    @PersistenceContext(unitName = "entityManagerFactory")
    private EntityManager entityManager;

    @Override
    public List<Rec> queryRec(QueryRec queryRec) {
        Date date = new Date();

        StringBuffer sql = new StringBuffer();
        sql.append(" SELECT NEW com.restart1025.springboot.rec.Rec (id, compId, debt, receive, lastReceiveDate, debtDate) " +
                   " FROM Rec " +
                   " WHERE 1 = 1 ");

        if (queryRec.getId() != null)
            sql.append(" AND compId = :id ");

        if (queryRec.isUndone())
            sql.append(" AND receive < debt ");

        if (queryRec.isExpired())
            sql.append(" AND debtDate < :date ");


        Query query = entityManager.createQuery(sql.toString(), Rec.class);

        if (queryRec.getId() != null)
            query.setParameter("id", queryRec.getId());

        if (queryRec.isExpired())
            query.setParameter("date", date);

        return query.getResultList();
    }
}
