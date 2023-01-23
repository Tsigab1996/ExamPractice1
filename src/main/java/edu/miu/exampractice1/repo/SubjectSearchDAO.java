package edu.miu.exampractice1.repo;

import edu.miu.exampractice1.entity.Subject;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class SubjectSearchDAO {
    private EntityManager em;

    public List<Subject> getAllSubjects(String topic){
        CriteriaBuilder cb= em.getCriteriaBuilder();
        CriteriaBuilder cq= (CriteriaBuilder) cb.createQuery(Subject.class);
        Root<Subject> root= cq.createQuery().from(Subject.class);

        Predicate tp= cb.like(root.get("topic"), "%"+ topic + "%");

        cb.createQuery().where(tp);

        TypedQuery<Subject> query= (TypedQuery<Subject>) em.createQuery(String.valueOf(cq));

        return query.getResultList();
    }
}
