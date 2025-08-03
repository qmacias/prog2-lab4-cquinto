package org.cquinto.domain;

import java.util.Comparator;

/**
 * Cristian Ezequiel Quinto
 */
public interface Sortable<T> {
    void sort();
    void sortBy(Comparator<T> comparator);
}
