package ru.netology.javaqa.javaqamvn;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class FilmsManagerTest {

    @Test
    public void testFilmsWithMoreThanLimit() {
        FilmsManager manager = new FilmsManager(12);
        manager.addFilm("film1");
        manager.addFilm("film2");
        manager.addFilm("film3");
        manager.addFilm("film4");
        manager.addFilm("film5");
        manager.addFilm("film6");
        manager.addFilm("film7");
        manager.addFilm("film8");

        String[] actual = manager.findAll();
        String[] expected = {"film1", "film2", "film3", "film4", "film5", "film6", "film7", "film8"};

        String[] actual2 = manager.findLast();
        String[] expected2 = {"film8", "film7", "film6", "film5", "film4", "film3", "film2", "film1"};

        assertArrayEquals(expected, actual);
        assertArrayEquals(expected2, actual2);
    }

    @Test
    public void testFilmsWithMoreLessLimit() {
        FilmsManager manager = new FilmsManager(5);
        manager.addFilm("film1");
        manager.addFilm("film2");
        manager.addFilm("film3");
        manager.addFilm("film4");
        manager.addFilm("film5");
        manager.addFilm("film6");
        manager.addFilm("film7");
        manager.addFilm("film8");

        String[] actual = manager.findAll();
        String[] expected = {"film1", "film2", "film3", "film4", "film5", "film6", "film7", "film8"};

        String[] actual2 = manager.findLast();
        String[] expected2 = {"film8", "film7", "film6", "film5", "film4"};

        assertArrayEquals(expected, actual);
        assertArrayEquals(expected2, actual2);
    }

    @Test
    public void testFilmsWithoutLimit() {
        FilmsManager manager = new FilmsManager();
        manager.addFilm("film1");
        manager.addFilm("film2");
        manager.addFilm("film3");
        manager.addFilm("film4");
        manager.addFilm("film5");
        manager.addFilm("film6");
        manager.addFilm("film7");
        manager.addFilm("film8");

        String[] actual = manager.findAll();
        String[] expected = {"film1", "film2", "film3", "film4", "film5", "film6", "film7", "film8"};

        String[] actual2 = manager.findLast();
        String[] expected2 = {"film8", "film7", "film6", "film5", "film4", "film3", "film2", "film1"};

        assertArrayEquals(expected, actual);
        assertArrayEquals(expected2, actual2);
    }

    @Test
    public void testFilmsEqualToTheLimit() {
        FilmsManager manager = new FilmsManager(5);
        manager.addFilm("film1");
        manager.addFilm("film2");
        manager.addFilm("film3");
        manager.addFilm("film4");
        manager.addFilm("film5");

        String[] actual = manager.findAll();
        String[] expected = {"film1", "film2", "film3", "film4", "film5"};

        String[] actual2 = manager.findLast();
        String[] expected2 = {"film5", "film4", "film3", "film2", "film1"};

        assertArrayEquals(expected, actual);
        assertArrayEquals(expected2, actual2);
    }
}
