package org.socramob.mock;

import org.junit.*;
import static org.mockito.Mockito.*;

import org.mockito.InOrder;

public class TodoListTestWithMockito {
    private Printer mockPrinter;
    private TodoList todoList;

    @Before
    public void setup() {
        todoList = new TodoList();
        todoList.add("feed the cat");
        todoList.add("finish taxstatement");
    }

    @Test
    public void shouldPrintTodos() throws OutOfPaperException {
        mockPrinter = mock(Printer.class);

        todoList.print(mockPrinter);

        //create inOrder object passing any mocks that need to be verified in order
        InOrder inOrder = inOrder(mockPrinter);

        inOrder.verify(mockPrinter).print("To-Dos for today");
        inOrder.verify(mockPrinter).crlf();
        inOrder.verify(mockPrinter).print("- feed the cat");
        inOrder.verify(mockPrinter).tab();
        inOrder.verify(mockPrinter).print("[ ]");
        inOrder.verify(mockPrinter).crlf();
        inOrder.verify(mockPrinter).print("- finish taxstatement");
        inOrder.verify(mockPrinter).tab();
        inOrder.verify(mockPrinter).print("[ ]");
        inOrder.verify(mockPrinter).crlf();
        inOrder.verify(mockPrinter).cutPaper();
    }

}
