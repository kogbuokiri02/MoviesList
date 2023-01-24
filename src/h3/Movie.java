package h3;


public class Movie implements Comparable <Movie>{
	
	public Movie left; 
	public double rating; 
	public Movie right; 
	public String title; 
	public int year;
	

	public Movie(String title, int year, double rating) {
		this.title = title; 
		this.year = year; 
		this.rating = rating;
		
	}
	

	@Override
	public int compareTo(Movie m) {
		// TODO Auto-generated method stub
		return this.title.compareToIgnoreCase(m.title) ;
	}
	
	public String toString() {
		return this.title + " ("+this.rating+")";
	}

}
