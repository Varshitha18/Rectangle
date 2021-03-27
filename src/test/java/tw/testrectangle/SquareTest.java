package tw.testrectangle;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import tw.rectangle.Square;

public class SquareTest {
	@Test
	public void testSquareAreaForPositiveValuedSide() {
		int side = 5;
		int expectedArea = 25;
		
		Square square = new Square(side);
		int actualArea = square.area();
		
		assertEquals(expectedArea, actualArea);
	}
	
	@Test
	public void testSquareAreaForNegativeValuedSide() {
		int side = -5;
		
		Square square = new Square(side);
		
		assertThrows(RuntimeException.class, () -> {square.area();});
	}
	
	@Test
	public void testSquareAreaForZeroValuedSide() {
		int side = 0;
		int expectedArea = 0;
		
		Square square = new Square(side);
		int actualArea = square.area();
		
		assertEquals(expectedArea, actualArea);
	}
	@Test
	public void testSquarePerimeterForPositiveValuedSide() {
		int side = 5;
		int expectedPerimeter = 20;
		
		Square square = new Square(side);
		int actualPerimeter = square.perimeter();
		
		assertEquals(expectedPerimeter, actualPerimeter);
	}
	@Test
	public void testSquarePerimeterForNegativeValuedSide() {
		int side = -5;
		int expectedPerimeter = -20;
		
		Square square = new Square(side);
		int actualPerimeter = square.perimeter();
		
		assertEquals(expectedPerimeter, actualPerimeter);
	}
	@Test
	public void testSquarePerimeterForZeroValuedSide() {
		int side = 0;
		int expectedPerimeter = 0;
		
		Square square = new Square(side);
		int actualPerimeter = square.perimeter();
		
		assertEquals(expectedPerimeter, actualPerimeter);
	}
}
