package h3;

public class MovieTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Movie movie1 = new Movie("Planet of the Apes", 2012, 10.0); 
		System.out.println(movie1.toString());
		
		
		Movie movie2 = new Movie("Narcos", 2011, 7.0); 
		System.out.println(movie2.toString());
		
		
		Movie movie3 = new Movie("Average", 2008, 6.5); 
		System.out.println(movie3.toString());
		
		
		Movie movie4 = new Movie("Two Hammers", 1896, 11.0); 
		System.out.println(movie4.toString());
		
		
		Movie movie5 = new Movie("Taking my Time and going slowly", 1999, 4.0); 
		System.out.println(movie5.toString());
		
		
		MovieBST moviebst = new MovieBST(); 
		System.out.println(moviebst.size());
		System.out.println(moviebst.getHeight());
		moviebst.inOrder();
		//System.out.println();
		
		moviebst.add(movie1);
		System.out.println(moviebst.size());
		System.out.println(moviebst.getHeight());
		moviebst.inOrder();
		System.out.println();
		
		moviebst.add(movie2);
		System.out.println(moviebst.size());
		System.out.println(moviebst.getHeight());
		moviebst.inOrder();
		System.out.println();
		
		moviebst.add(movie3);
		System.out.println(moviebst.size());
		System.out.println(moviebst.getHeight());
		moviebst.inOrder();
		System.out.println();
		
		moviebst.add(movie4);
		System.out.println(moviebst.size());
		System.out.println(moviebst.getHeight());
		moviebst.inOrder();
		System.out.println();
		
		moviebst.add(movie5);
		System.out.println(moviebst.size());
		System.out.println(moviebst.getHeight());
		
		moviebst.inOrder();
		System.out.println();
		System.out.println(moviebst.getRatingByTitle("planet of the Apes"));
		System.out.println(moviebst.getRatingByTitle("Narcos"));
		System.out.println(moviebst.getRatingByTitle("aVERAGE"));
		System.out.println(moviebst.getRatingByTitle("Two Hammers"));
		System.out.println(moviebst.getRatingByTitle("Taking my Time and going slowly"));
		

		
	}

}
