package org.socramob.mock;

import java.util.ArrayList;
import java.util.List;

public class TodoList {

	List<String> todos = new ArrayList<String>();

	public void add(String todo) {
		todos.add(todo);
	}

	public void print(Printer printer) {
		try {
			printer.print("To-Dos for today");
			printer.crlf();
			for (String todo : todos) {
				printer.print("- " + todo);
				printer.tab();
				printer.print("[ ]");
				printer.crlf();
			}
			printer.cutPaper();
		} catch (OutOfPaperException e) {
			throw new TodoListException("Could not print your todos", e);
		}
	}

}
