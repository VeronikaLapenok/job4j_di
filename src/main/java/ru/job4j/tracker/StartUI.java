package ru.job4j.tracker;

import org.springframework.stereotype.Component;

@Component
public class StartUI {
    private Store store;
    private ConsoleInput input;

    public StartUI(Store store, ConsoleInput input) {
        this.store = store;
        this.input = input;
    }

    public void add() {
        store.add(input.askStr("Enter name: " + System.lineSeparator()));
    }

    public void print() {
        for (String value : store.getAll()) {
            System.out.println(value);
        }
    }
}
