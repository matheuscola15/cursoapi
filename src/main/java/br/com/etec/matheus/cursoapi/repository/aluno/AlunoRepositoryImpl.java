package br.com.etec.matheus.cursoapi.repository.aluno;

import br.com.etec.matheus.cursoapi.model.Aluno;
import br.com.etec.matheus.cursoapi.repository.filter.AlunoFilter;
import br.com.etec.matheus.cursoapi.repository.projections.AlunoDto;
import org.apache.commons.lang3.reflect.Typed;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

public class AlunoRepositoryImpl implements AlunoRepositoryQuery{

    @PersistenceContext
    private EntityManager manager;

    @Override
    public Page<AlunoDto> Filtrar(AlunoFilter alunoFilter, Pageable pageable){

        CriteriaBuilder builder = manager.getCriteriaBuilder();
        CriteriaQuery<AlunoDto> criteria = builder.createQuery(AlunoDto.class);
        Root<Aluno> root = criteria.from(Aluno.class);

        criteria.select(builder.construct(AlunoDto.class, root.get("id"), root.get("nomealuno"),
                root.get("cidade").get("nomecidade"), root.get("cidade").get("uf"), root.get("curso").get("nomecurso")
                ));


        Predicate[] predicates = criarRestricoes(alunoFilter, builder, root);
        criteria.where(predicates);
        criteria.orderBy(builder.asc(root.get("nomealuno")));

        TypedQuery<AlunoDto> query = manager.createQuery(criteria);
        adicionarRestricoes(query, pageable);

        return new PageImpl<>(query.getResultList(), pageable, total(alunoFilter));



    }

    private Predicate[] criarRestricoes(AlunoFilter alunoFilter, CriteriaBuilder builder, Root<Aluno> root) {
    }

    private void adicionarRestricoes(TypedQuery<AlunoDto> query, Pageable pageable) {

        int paginaAtual = pageable.getPageNumber();
        int totalRegistrosPorPagina = pageable.getPageSize();
        int primeiroRegistroPagina = paginaAtual * totalRegistrosPorPagina;

        query.setFirstResult(primeiroRegistroPagina);
        query.setMaxResults(totalRegistrosPorPagina);

    }

    private Long total(AlunoFilter alunoFilter) {

        CriteriaBuilder builder = manager.getCriteriaBuilder();
        CriteriaQuery<Long> criteria = builder.createQuery(Long.class);
        Root<Aluno> root = criteria.from(Aluno.class);

        Predicate[] predicates = criarRestricoes(alunoFilter, builder, root);
        criteria.where(predicates);
        criteria.orderBy(builder.asc(root.get("nomealuno")));




    }

}
