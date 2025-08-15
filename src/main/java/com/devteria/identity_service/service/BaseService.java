package com.devteria.identity_service.service;

import org.springframework.data.jpa.repository.JpaRepository;

public abstract class BaseService<T, ID> {
    protected final JpaRepository<T, ID> repo;

    protected BaseService(JpaRepository<T, ID> repo) {
        this.repo = repo;
    }

//    public T findByIdOrThrow(ID id) {
//        return repo.findById(id).orElseThrow(() ->
//                new AppException("NOT_FOUND", "Không tìm thấy đối tượng")
//        );
//    }
}
