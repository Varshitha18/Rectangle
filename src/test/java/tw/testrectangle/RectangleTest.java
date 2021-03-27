package tw.testrectangle;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertThrows;
import java.lang.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import tw.rectangle.Rectangle;

public class RectangleTest {
	@Test
	public void TestRectangleAreaForPositiveLengthAndBreadth() {
		int expectedArea;
		int length = 3;
		int breadth = 4;
		int actualArea = 12;
		
		Rectangle rectangle = new Rectangle(length, breadth);
		expectedArea = rectangle.area();
		
		assertEquals(actualArea, expectedArea);
	}
	
	@Test
	public void TestForRectangleAreaForLengthAsZero() {
		int expectedArea;
		int length = 0;
		int breadth = 4;
		int actualArea = 0;
		
		Rectangle rectangle = new Rectangle(length, breadth);
		expectedArea = rectangle.area();
		
		assertEquals(actualArea, expectedArea);
	}
	
	@Test
	public void TestForRectangleAreaForBreadthAsZero() {
		int expectedArea;
		int length = 7;
		int breadth = 0;
		int actualArea = 0;
		
		Rectangle rectangle = new Rectangle(length, breadth);
		expectedArea = rectangle.area();
		
		assertEquals(actualArea, expectedArea);
	}
	
	@Test
	public void TestForRectangleAreaForLengthAndBreadthAsZero() {
		int expectedArea;
		int length = 0;
		int breadth = 0;
		int actualArea = 0;
		
		Rectangle rectangle = new Rectangle(length, breadth);
		expectedArea = rectangle.area();
		
		assertEquals(actualArea, expectedArea);
	}
	
	@Test
	public void TestForRectangleAreaForNegativeLength() {
		//int actualArea;
		int length = -2;
		int breadth = 4;
		//String expectedArea = "Area for negative sides cannot be calculated";
		
		Rectangle rectangle = new Rectangle(length, breadth);
		//actualArea = rectangle.areaOfRectangle();
		assertThrows(RuntimeException.class, () -> {rectangle.area();});
	}
	
	@Test
	public void TestRectanglePerimeterForPositiveLengthAndBreadth() {
		int expectedPerimeter;
		int length = 3;
		int breadth = 4;
		int actualPerimeter = 14;
		
		Rectangle rectangle = new Rectangle(length, breadth);
		expectedPerimeter = rectangle.perimeter();
		
		assertEquals(actualPerimeter, expectedPerimeter);
	}
	
	@Test
	public void TestRectanglePerimeterForLengthAsZero() {
		int expectedPerimeter;
		int length = 0;
		int breadth = 4;
		int actualPerimeter = 8;
		
		Rectangle rectangle = new Rectangle(length, breadth);
		expectedPerimeter = rectangle.perimeter();
		
		assertEquals(actualPerimeter, expectedPerimeter);
	}
	
	@Test
	public void TestRectanglePerimeterForBreadthAsZero() {
		int expectedPerimeter;
		int length = 3;
		int breadth = 0;
		int actualPerimeter = 6;
		
		Rectangle rectangle = new Rectangle(length, breadth);
		expectedPerimeter = rectangle.perimeter();
		
		assertEquals(actualPerimeter, expectedPerimeter);
	}
	
	@Test
	public void TestRectanglePerimeterForLengthAndBreadthAsZero() {
		int expectedPerimeter;
		int length = 0;
		int breadth = 0;
		int actualPerimeter = 0;
		
		Rectangle rectangle = new Rectangle(length, breadth);
		expectedPerimeter = rectangle.perimeter();
		
		assertEquals(actualPerimeter, expectedPerimeter);
	}
	
	@Test
	public void TestRectanglePerimeterForLengthValuedNegative() {
		int expectedPerimeter;
		int length = -5;
		int breadth = 4;
		int actualPerimeter = -2;
		
		Rectangle rectangle = new Rectangle(length, breadth);
		expectedPerimeter = rectangle.perimeter();
		
		assertEquals(actualPerimeter, expectedPerimeter);
	}
	
	@Test
	public void TestRectanglePerimeterForBreadthValuedNegative() {
		int expectedPerimeter;
		int length = 3;
		int breadth = -4;
		int actualPerimeter = -2;
		
		Rectangle rectangle = new Rectangle(length, breadth);
		expectedPerimeter = rectangle.perimeter();
		
		assertEquals(actualPerimeter, expectedPerimeter);
	}
	
	@Test
	public void TestRectanglePerimeterForLengthAndBreadthNegative() {
		int expectedPerimeter;
		int length = -2;
		int breadth = -3;
		int actualPerimeter = -10;
		
		Rectangle rectangle = new Rectangle(length, breadth);
		expectedPerimeter = rectangle.perimeter();
		
		assertEquals(actualPerimeter, expectedPerimeter);
	}
	
	
}
