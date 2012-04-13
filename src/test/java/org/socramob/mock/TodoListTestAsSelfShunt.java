package org.socramob.mock;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TodoListTestAsSelfShunt implements NaivePrinter {

	private TodoList todoList;
	private String printerOutput;

	@Before
	public void setup() {
		todoList = new TodoList();
		todoList.add("feed the cat");
		todoList.add("finish taxstatement");
		
		printerOutput = "";
	}
	
	public void print(String text) {
		printerOutput += text;
	}
	
	@Test
	public void shouldPrintTodos() {
		todoList.print(this);
		assertThat(printerOutput, is(	"To-Dos for today\n" +
										"- feed the cat\t[ ]\n" +
										"- finish taxstatement\t[ ]\n"));
	}

}
