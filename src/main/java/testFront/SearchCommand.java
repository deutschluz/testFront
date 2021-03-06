package testFront;

import java.io.IOException;

import javax.servlet.ServletException;

public class SearchCommand extends FrontCommand {
	 @Override
	    public void process() throws ServletException, IOException {
	        Book book = new BookShelfImpl().getInstance()
	          .findByTitle(request.getParameter("title"));
	        if (book != null) {
	            request.setAttribute("book", book);
	            forward("book-found");
	        } else {
	            forward("book-notfound");
	        }
	    }
}
