import org.junit.Before;
import org.junit.Test;
import staff.management.Director;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void setUp() {
        director = new Director("Neil Godwin", "FT921756P", 3500.00, "Management", 200000.00);
    }

    @Test
    public void hasName() {
        assertEquals("Neil Godwin", director.getName());
    }

    @Test
    public void canSetName() {
        director.setName("Tim Canterbury");
        assertEquals("Tim Canterbury", director.getName());
    }

    @Test
    public void cantSetNameWithNull() {
        director.setName(null);
        assertEquals("Neil Godwin", director.getName());
    }

    @Test
    public void hasNINumber() {
        assertEquals("FT921756P", director.getNationalInsuranceNumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(3500.00, director.getSalary(), 0.1);
    }

    @Test
    public void hasDepartment() {
        assertEquals("Management", director.getDeptName());
    }

    @Test
    public void canRaiseSalary() {
        director.raiseSalary(350.00);
        assertEquals(3850.00, director.getSalary(), 0.1);
    }

    @Test
    public void hasPayBonus() {
        assertEquals(70.00, director.payBonus(), 0.1);
    }

    @Test
    public void hasBudget() {
        assertEquals(200000.00, director.getBudget(), 0.1);
    }
}
