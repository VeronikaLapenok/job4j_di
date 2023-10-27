package ru.job4j.tracker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StartUI {
    @Autowired
    private Store store;
    @Autowired
    private ConsoleInput input;

    public void add() {
        store.add(input.askStr("Enter name: " + System.lineSeparator()));
    }

    public void print() {
        for (String value : store.getAll()) {
            System.out.println(value);
        }
    }
}
