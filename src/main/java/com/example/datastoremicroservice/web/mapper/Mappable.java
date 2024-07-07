package com.example.datastoremicroservice.web.mapper;

import java.util.List;

public interface Mappable<E, D> {

    E toEntity(D d);

    List<E> toEntity(List<D> ds);

    D toDto(E e);

    List<D> toDto(List<E> es);
}
