package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class TriangleTest {
		@BeforeClass
		public static void setUpBeforeClass() throws Exception {
		}
		@AfterClass
		public static void tearDownAfterClass() throws Exception {
		}
		@Before
		public void setUp() throws Exception {
		}
		@After
		public void tearDown() throws Exception {
		}
		@Test
		public void testGetter() {
		Triangle total = new Triangle(4,5,6);
		assertTrue(total.getS1() == 4);
		assertTrue(total.getS2() == 5);
		assertTrue(total.getS3() == 6);
		}
		@Test
		public void testPerimeter() {
		Triangle total = new Triangle(4,5,6);
		double x = total.getPerimeter();
		assertTrue(x == 15.0);
		}
		@Test
		public void testArea() {
		Triangle total = new Triangle(4,5,6);
		double x = total.getArea();
		assertTrue(x == 9.921567416492215);
		}
}