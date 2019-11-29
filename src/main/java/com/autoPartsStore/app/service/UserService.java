package com.autoPartsStore.app.service;

import java.util.Collection;
import java.util.Optional;

/**
 * The interface User service.
 *
 * @param <T> the type parameter
 */
public interface UserService<T> {
    /**
     * Save optional.
     *
     * @param t the t
     * @return the optional
     */
    Optional<T> save(T t);

    /**
     * Update optional.
     *
     * @param t the t
     * @return the optional
     */
    Optional<T> update(T t);

    /**
     * Gets all.
     *
     * @return the all
     */
    Collection<T> getAll();

    /**
     * Gets by id.
     *
     * @param id the id
     * @return the by id
     */
    Optional<T> getById(Long id);

    /**
     * Delete.
     *
     * @param t the t
     */
    void delete(T t);

    /**
     * Delete all.
     */
    void deleteAll();

    /**
     * Delete by id.
     *
     * @param id the id
     */
    void deleteById(Long id);
}