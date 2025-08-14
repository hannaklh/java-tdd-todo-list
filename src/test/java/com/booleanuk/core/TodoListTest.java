package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

class TodoListTest {
    TodoList toDo;
    HashMap<String, Boolean> testList = new HashMap<>(Map.of("Clean", false, "Cook", true, "Walk the dog", false));

    public TodoListTest() {
        this.toDo = new TodoList();
    }
    @Test
    public void shouldAddName() {
        String name = "Clean";

        Assertions.assertEquals(true, this.toDo.add(name));
    }
    @Test
    public void shouldView() {

        Assertions.assertEquals("{}", this.toDo.view());

        this.toDo.toDos = testList;

        Assertions.assertEquals("{Clean=false, Cook=true, Walk the dog=false}", this.toDo.view());

    }
    @Test
    public void shouldChangeStatus() {
        this.toDo.add("Nap");
        this.toDo.changeStatus("Nap");

        Assertions.assertEquals(true, this.toDo.changeStatus("Nap"));

        this.toDo.changeStatus("Nap");
        Assertions.assertEquals(false, this.toDo.changeStatus("Nap"));

    }
    @Test
    public void shouldViewCompletedTasks() {

        this.toDo.toDos = testList;

        Assertions.assertEquals("{Cook=true}", this.toDo.viewCompletedTasks());
    }
    @Test
    public void shouldViewIncompletedTasks() {

        this.toDo.toDos = testList;

        Assertions.assertEquals("{Clean=false, Walk the dog=false}", this.toDo.viewCompletedTasks());
    }
    @Test
    public void shouldRemoveTask() {

        this.toDo.toDos = testList;

        Assertions.assertEquals(true,  toDo.removeTask("Clean"));

    }
    @Test
    public void shouldSearchTask() {
        this.toDo.toDos = testList;

        Assertions.assertEquals("Clean",  toDo.searchTask("Clean"));


    }
    @Test
    public void shouldSortAsc() {

        this.toDo.toDos = testList;
        this.toDo.add("A little bit of this and that");

        Assertions.assertEquals("{A little bit of this and that=false, Clean=false, Cook=true, Walk the dog=false}",  toDo.sortAsc());

    }
    @Test
    public void shouldSortDesc() {
        this.toDo.toDos = testList;

        Assertions.assertEquals("{Walk the dog=false, Cook=true, Clean=false}",  toDo.sortDesc());

    }

}
