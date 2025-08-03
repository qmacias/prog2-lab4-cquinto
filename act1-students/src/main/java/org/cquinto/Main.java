package org.cquinto;

import java.util.List;

/**
 * Cristian Ezequiel Quinto
 */
public class Main {
    private static void assertEquals(String expected, String current) {
        if (expected != null && current != null) {
            if (!expected.equals(current)) {
                throw new AssertionError(String.format("Current result %s is different from expected result is %s", current, expected));
            }
        }
    }

    private static void assertEquals(int expected, int current) {
        if (expected != current) {
            throw new AssertionError(String.format("Current result %d is different from expected result %d", current, expected));
        }
    }

    public static void encapsulation() {
        var ints = new Integer[] {1,2,3};

        List<Integer> list = new UniArrayList<Integer>(ints);

        ints[1] = 1;

        assertEquals("[1, 2, 3]", list.toString());
    }

    public static void addAt() {
        var ints = new Integer[] {1, 2, 3};

        List<Integer> list = new UniArrayList<>(ints);

        list.add(0, 4);

        assertEquals("[4, 1, 2, 3]", list.toString());

        list.add(4, 5);

        assertEquals("[4, 1, 2, 3, 5]", list.toString());
    }

    public static void adding() {
        List<String> list = new UniArrayList<>();

        var size = 1_000_000;

        assertEquals(0, list.size());

        for (int i = 0; i < size; i++) {
            list.add(Integer.toString(i));
        }

        assertEquals(size, list.size());

        assertEquals("999999", list.get(size - 1));
    }

    public static void removing() {
        var chars = new Character[] {'a', 'b', 'c'};
        List<Character> list = new UniArrayList<>(chars);
        list.remove(Character.valueOf('b'));
        assertEquals("[a, c]", list.toString());
        list.add('b');
        assertEquals("[a, c, b]", list.toString());
        list.remove(Character.valueOf('a'));
        assertEquals("[c, b]", list.toString());
    }

    public static void removingAt() {
        var ints = new Integer[] {1, 2, 3};
        List<Integer> list = new UniArrayList<>(ints);
        Integer removed = list.remove(1);
        assertEquals(Integer.valueOf(2), removed);
        assertEquals("[1, 3]", list.toString());
        list.remove(Integer.valueOf(3));
        assertEquals("[1]", list.toString());
    }

    public static void iterating() {
        var ints = new Integer[] {1, 2, 3};
        List<Integer> list = new UniArrayList<>(ints);
        int count = 1;
        for (Integer i : list) {
            assertEquals(count++, i);
        }
    }

    public static void sorting() {
        var arrayStudents = new Student[] {
                new Student("S2", 100),
                new Student("S1", 51),
                new Student("S3", 50)
        };
        Sortable<Student> students = new UniArrayList<>(arrayStudents);

        assertEquals("[{S2,100}, {S1,51}, {S3,50}]", students.toString());

        students.sort();
        assertEquals("[{S1,51}, {S2,100}, {S3,50}]", students.toString());

        students.sortBy(Student.byGrade());
        assertEquals("[{S3,50}, {S1,51}, {S2,100}]", students.toString());

    }

    public static void unique() {
        var arrayStudents = new Student[] {
                new Student("S2", 51),
                new Student("S2", 50),
                new Student("S2", 51),
                new Student("S2", 50)
        };
        Unique<Student> students = new UniArrayList<>(arrayStudents);

        students.unique();
        assertEquals("[{S2,51}, {S2,50}]", students.toString());
    }

    public static void main(String[] args) {
        encapsulation();
        addAt();
        adding();
//        removing();
//        removingAt();
//        iterating();
//        sorting();
//        unique();
    }

}
