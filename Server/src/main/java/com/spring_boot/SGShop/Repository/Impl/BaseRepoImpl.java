package com.spring_boot.SGShop.Repository.Impl;

import com.querydsl.jpa.impl.JPAQueryFactory;
import com.spring_boot.SGShop.Modal.QAddress;
import com.spring_boot.SGShop.Modal.QUser;
import com.spring_boot.SGShop.Repository.BaseRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;

public abstract class BaseRepoImpl<T, ID> extends SimpleJpaRepository<T, ID> implements BaseRepository<T, ID> {
    @PersistenceContext
    EntityManager em;
    JPAQueryFactory jpaQueryFactory;

    protected final QUser user = QUser.user;
    protected final QAddress address = QAddress.address;


    public BaseRepoImpl(Class<T> domainClass, EntityManager em) {
        super(domainClass, em);
        this.em = em;
        this.jpaQueryFactory = new JPAQueryFactory(em);
    }
}
