package com.irs.mapstructexample.mapper;

import java.util.List;

/**
 * Mapper base para convertir DTOs a Entities y viceversa.
 * 
 * @param <D> Objecto DTO
 * @param <E> Objeto Entity
 * 
 * @author IRS
 * @version 1.0.0
 */
public interface EntityMapper<D, E> {

    /**
     * Mapea un DTO a una Entity
     *
     * @param dto El objeto dto a mapear
     * @return Una Entity
     */
    E toEntity(D dto);

    /**
     * Mapea una Entity a un DTO
     *
     * @param entity El objeto entity a mapear
     * @return Un DTO
     */
    D toDto(E entity);

    /**
     * Mapea una lista de DTOs a una lista de Entities
     *
     * @param dtoList La lista de DTOs a mapear
     * @return Una lista de Entities
     */
    List<E> toEntity(List<D> dtoList);

    /**
     * Mapea una lista de Entities a una lista de DTOs
     *
     * @param entityList La lista de Entities a mapear
     * @return Una lista de DTOs
     */
    List<D> toDto(List<E> entityList);
}
