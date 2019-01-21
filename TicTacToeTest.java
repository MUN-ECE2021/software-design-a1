// Input stream test for TicTacToe assign
// remember to add junit libraries to your project 
// properties->java build path -> add library

import org.junit.Test;

//import static TicTacToeApplication.main;
import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;

public class TicTacToeTest {

    @Test
    public void FeedInput() {
    	String [] start = {"y\nn\n0\n0\n1\n1\n0\n2"};
    	ByteArrayInputStream in = new ByteArrayInputStream(start[0].getBytes());
    	System.setIn(in);
    	
    	TicTacToeApplication game = new TicTacToeApplication();
    	game.main(start);
    }
}
