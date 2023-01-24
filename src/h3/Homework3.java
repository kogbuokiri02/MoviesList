package h3;



import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.*;

public class Homework3 {
	
	/**
	 * This method takes a MovieArrayList and a movie title,
	 * calls getRatingByTitle(movieTitle) method,
	 * returns the elasped time it took in nanoseconds.
	 */
	private static long getElapsedTime(MovieArrayList list, String movieTitle) {
		long startTime = System.nanoTime();
		System.out.println(list.getRatingByTitle(movieTitle));
        long endTime = System.nanoTime();
        long timeElapsed = endTime - startTime;
        return timeElapsed;
	}
	
	/**
	 * This method takes a MovieBST and a movie title,
	 * calls getRatingByTitle(movieTitle) method,
	 * returns the elasped time it took in nanoseconds.
	 */
	
	private static long getElapsedTime(MovieBST tree, String movieTitle) {
		long startTime = System.nanoTime();
		System.out.println(tree.getRatingByTitle(movieTitle));
        long endTime = System.nanoTime();
        long timeElapsed = endTime - startTime;
        return timeElapsed;
	}
	
	/**
	 * This method takes a JSONObject movie,
	 * parse and extract the title, the year and the rating from the JSONObject,
	 * constructs and returns a Movie object containing the information.
	 */
	
	private static Movie parseMovieObject(JSONObject movie) {
        
        //Get movie title
        String title = (String) movie.get("title");             
        //Get movie year
        String year = (String) movie.get("year");         
        //Get movie rating
        String rating = (String) movie.get("rating");
        
        Movie m = new Movie(title, Integer.parseInt(year), Double.parseDouble(rating));
        return m;
	}
	
	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
		// Your code goes in here
		//JSONArray jsonArray = new JSONArray();
		//Parsing the contents of the JSON file
		MovieArrayList moviearray = new MovieArrayList(); 
		MovieBST moviebst = new MovieBST();
		JSONParser parser = new JSONParser();
		JSONArray a = (JSONArray) parser.parse(new FileReader("C:\\\\Users\\\\ogbuo\\\\eclipse-workspace\\\\Homework3\\\\"+args[0]));
		for (Object o : a){
			Movie movie = parseMovieObject((JSONObject)o);
			moviearray.add(movie); 
			moviebst.add(movie);
		  }
		System.out.println(getElapsedTime(moviearray,args[1]));
		System.out.println(getElapsedTime(moviebst,args[1] ));
		System.out.println(moviebst.getHeight());
		System.out.println(moviebst.size());
		//System.out.print(moviearray.toString());
		
	
		
		
	}
}

