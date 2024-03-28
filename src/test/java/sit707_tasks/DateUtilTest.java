package sit707_tasks;

import java.util.Random;

import org.junit.Assert;
import org.junit.Test;


/**
 * @author Ahsan Habib
 */
public class DateUtilTest {
	
	@Test
	public void testStudentIdentity() {
		String studentId = "222435189";
		Assert.assertNotNull("Student ID is null", studentId);
	}

	@Test
	public void testStudentName() {
		String studentName = "Samadhi Jayasinghe";
		Assert.assertNotNull("Student name is null", studentName);
	}

	@Test
	public void testMaxJanuary31ShouldIncrementToFebruary1() {
		// January max boundary area: max+1
		DateUtil date = new DateUtil(31, 1, 2024);
        System.out.println("january31ShouldIncrementToFebruary1 > " + date);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(2, date.getMonth());
        Assert.assertEquals(1, date.getDay());
	}
	
	@Test
	public void testMaxJanuary31ShouldDecrementToJanuary30() {
		// January max boundary area: max-1
		DateUtil date = new DateUtil(31, 1, 2024);
        System.out.println("january31ShouldDecrementToJanuary30 > " + date);
        date.decrement();
        System.out.println(date);
        Assert.assertEquals(30, date.getDay());
        Assert.assertEquals(1, date.getMonth());
	}
	
	@Test
	public void testNominalJanuary() {
		int rand_day_1_to_31 = 1 + new Random().nextInt(31);
        DateUtil date = new DateUtil(rand_day_1_to_31, 1, 2024);
        System.out.println("testJanuaryNominal > " + date);
        date.increment();
        System.out.println(date);
	}
	
	/*
	 * Complete below test cases.
	 */
	
	@Test
	public void testMinJanuary1ShouldIncrementToJanuary2() {
		// January min boundary area: min+1
	    DateUtil date = new DateUtil(1, 1, 2024);
	    System.out.println("testMinJanuary1ShouldIncrementToJanuary2 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(2, date.getDay());
	    Assert.assertEquals(1, date.getMonth());
	}
	
	@Test
	public void testMinJanuary1ShouldDecrementToDecember31() {
	    // January min boundary area: min-1
	    DateUtil date = new DateUtil(1, 1, 2024);
	    System.out.println("testMinJanuary1ShouldDecrementToDecember31 > " + date);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(31, date.getDay());
	    Assert.assertEquals(12, date.getMonth());
	    Assert.assertEquals(2023, date.getYear());
	}
	
	/*
	 * Write tests for rest months of year 2024.
	 */
	@Test
    public void testNextDate1() {
        DateUtil date = new DateUtil(1, 6, 1994);
        date.increment();
        System.out.println("\nExpected Next\n");
        System.out.println(date);
        Assert.assertEquals(2, date.getDay());
        Assert.assertEquals(6, date.getMonth());
        Assert.assertEquals(1994, date.getYear());
    }

    @Test
    public void testNextDate2() {
        DateUtil date = new DateUtil(2, 6, 1994);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(3, date.getDay());
        Assert.assertEquals(6, date.getMonth());
        Assert.assertEquals(1994, date.getYear());
    }

    @Test
    public void testNextDate3() {
        DateUtil date = new DateUtil(15, 6, 1994);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(16, date.getDay());
        Assert.assertEquals(6, date.getMonth());
        Assert.assertEquals(1994, date.getYear());
    }

    @Test
    public void testNextDate4() {
        DateUtil date = new DateUtil(30, 6, 1994);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(1, date.getDay());
        Assert.assertEquals(7, date.getMonth());
        Assert.assertEquals(1994, date.getYear());
    }

    @Test
    public void testNextDate5() {
        DateUtil date = new DateUtil(31, 6, 1994);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(1, date.getDay());
        Assert.assertEquals(7, date.getMonth());
        Assert.assertEquals(1994, date.getYear());
    }

    @Test
    public void testNextDate6() {
        DateUtil date = new DateUtil(15, 1, 1994);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(16, date.getDay());
        Assert.assertEquals(1, date.getMonth());
        Assert.assertEquals(1994, date.getYear());
    }

    @Test
    public void testNextDate7() {
        DateUtil date = new DateUtil(15, 2, 1994);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(16, date.getDay());
        Assert.assertEquals(2, date.getMonth());
        Assert.assertEquals(1994, date.getYear());
    }

    @Test
    public void testNextDate8() {
        DateUtil date = new DateUtil(15, 11, 1994);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(16, date.getDay());
        Assert.assertEquals(11, date.getMonth());
        Assert.assertEquals(1994, date.getYear());
    }

    @Test
    public void testNextDate9() {
        DateUtil date = new DateUtil(15, 12, 1994);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(16, date.getDay());
        Assert.assertEquals(12, date.getMonth());
        Assert.assertEquals(1994, date.getYear());
    }

    @Test
    public void testNextDate10() {
        DateUtil date = new DateUtil(15, 6, 1700);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(16, date.getDay());
        Assert.assertEquals(6, date.getMonth());
        Assert.assertEquals(1700, date.getYear());
    }

    @Test
    public void testNextDate11() {
        DateUtil date = new DateUtil(15, 6, 1701);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(16, date.getDay());
        Assert.assertEquals(6, date.getMonth());
        Assert.assertEquals(1701, date.getYear());
    }

    @Test
    public void testNextDate12() {
        DateUtil date = new DateUtil(15, 6, 2023);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(16, date.getDay());
        Assert.assertEquals(6, date.getMonth());
        Assert.assertEquals(2023, date.getYear());
    }

    @Test
    public void testNextDate13() {
        DateUtil date = new DateUtil(15, 6, 2024);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(16, date.getDay());
        Assert.assertEquals(6, date.getMonth());
        Assert.assertEquals(2024, date.getYear());
    }
    
    @Test
    public void testPreviousDateFebruaryLeapYear() {
        // February 29th, 2000 is a leap year
        DateUtil date = new DateUtil(29, 2, 2000);
        date.decrement();
        System.out.println("\nLeap Year Condition with Previous Date Check\n");
        System.out.println(date);
        Assert.assertEquals(28, date.getDay());
        Assert.assertEquals(2, date.getMonth());
        Assert.assertEquals(2000, date.getYear());
    }

    @Test
    public void testNextDateFebruaryLeapYear() {
        // February 28th, 2000 is a leap year
        DateUtil date = new DateUtil(28, 2, 2000);
        date.increment();
        System.out.println("\nLeap Year Condition with Next Date Check\n");
        System.out.println(date);
        Assert.assertEquals(29, date.getDay());
        Assert.assertEquals(2, date.getMonth());
        Assert.assertEquals(2000, date.getYear());
    }
    
    
}
