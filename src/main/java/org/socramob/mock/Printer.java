package org.socramob.mock;

public interface Printer {
	
	public void print(String text) throws OutOfPaperException;
	public void tab() throws OutOfPaperException;
	public void crlf() throws OutOfPaperException;
	public void cutPaper() throws OutOfPaperException;

}
