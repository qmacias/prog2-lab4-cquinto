package org.cquinto;

import java.util.*;

/**
 * Cristian Ezequiel Quinto
 */
public class UniArrayList<T extends Comparable<T>> implements List, Sortable, Unique {
    private List<T> list;

    public UniArrayList () {
        list = new ArrayList<>();
    }

    public UniArrayList(T[] ints) {
        list = new ArrayList<>(Arrays.asList(ints));
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator iterator() {
        return list.iterator();
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public boolean add(Object o) {
        list.add((T) o);

        return true;
    }

    @Override
    public boolean remove(Object o) {
        list.remove(o);

        return true;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public Object get(int index) {
        return list.get(index);
    }

    @Override
    public Object set(int index, Object element) {
        return null;
    }

    @Override
    public void add(int index, Object element) {
        list.add(index, (T) element);
    }

    @Override
    public Object remove(int index) {
        return list.remove(index);
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator listIterator() {
        return null;
    }

    @Override
    public ListIterator listIterator(int index) {
        return null;
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }

    @Override
    public String toString() {
        return list.toString();
    }

    @Override
    public void sort() {
        Collections.sort(list);
    }

    @Override
    public void sortBy(Comparator comparator) {
        list.sort(comparator);
    }

    @Override
    public void unique() {
        List<T> uniqueList = new ArrayList<>();

        for (T student : list) {
            if (!uniqueList.contains(student)) {
                uniqueList.add(student);
            }
        }

        list = uniqueList;
    }

}
