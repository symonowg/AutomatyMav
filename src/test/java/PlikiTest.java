import java.io.BufferedReader;
import java.io.FileReader;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class PlikiTest {


@Mock
FileReader fileReader;

BufferedReader bufferedReader;

@Before
public void setUp() throws Exception{
System.out.println("Before");
bufferedReader = Mockito.mock(BufferedReader.class);
//when(bufferedReader.readLine()).thenReturn("Ala ma kota");
}

@BeforeClass
public static void setBeforeClass() {
System.out.println("BeforeClass");
}

@After
public void setAfter() {
System.out.println("After");
}

@AfterClass
public static void setAfterClass() {
System.out.println("AfterClass");
}

@Test(expected = Exception.class)
public void shouldReturnException() {
System.out.println("Test");
//Main.testMethod("");
}

// @Test(expected = Exception.class)
public void shouldReturnExceptionFromTry() {
System.out.println("Test");
//Main.testMethodEx(null);
}

@Test
public void shouldReturnTextFromFile() throws Exception {
System.out.println("Test");
//String text = Pliki.readTextFile("");
//Assert.assertNull(text);
}

@Test
public void performWithEmptyVariable() {
System.out.println("Test");
//String wartosc = Main.jakasMetoda(null);
//Assert.assertNull(wartosc);
}

@Test
public void shouldReturnAnyString() {
System.out.println("Test");
//String wartosc = Main.jakasMetoda("");
//Assert.assertNotNull(wartosc);
//Assert.assertEquals(wartosc, "");
//Assert.assertSame(wartosc, "");
}

}
