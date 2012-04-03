package org.socramob.mock;

import org.easymock.EasyMock;
import org.junit.Before;
import org.junit.Test;

public class TodoListTestWithEasyMock {
	private Printer mockPrinter;
	private TodoList todoList;

	@Before
	public void setup() {
		mockPrinter = EasyMock.createMock(Printer.class);
		
		todoList = new TodoList();
		todoList.add("feed the cat");
		todoList.add("finish taxstatement");
	}

	@Test
	public void shouldPrintTodos() throws OutOfPaperException {
		mockPrinter.print("To-Dos for today");
		mockPrinter.crlf();
		mockPrinter.print("- feed the cat");
		mockPrinter.tab();
		mockPrinter.print("[ ]");
		mockPrinter.crlf();
		mockPrinter.print("- finish taxstatement");
		mockPrinter.tab();
		mockPrinter.print("[ ]");
		mockPrinter.crlf();
		mockPrinter.cutPaper();

		EasyMock.replay(mockPrinter);

		todoList.print(mockPrinter);

		EasyMock.verify(mockPrinter);
	}

}
