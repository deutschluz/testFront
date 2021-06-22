package testFront;

public class BookShelfImpl implements Bookshelf {

	@Override
	public Bookshelf getInstance() {
		// returns an instance of 
		return new BookShelfImpl();
	}

	@Override
	public <E extends Book> boolean add(E book) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Book findByTitle(String title) {
		// TODO Auto-generated method stub
		return new Book("Scroty","McBoogerBalls",9.99);
	}

}
