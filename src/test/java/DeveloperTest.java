import org.junit.Before;
import org.junit.Test;
import staff.techStaff.Developer;


import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void setUp() {
        developer = new Developer("Gareth Keenan", "BG800813S", 1500.00);
    }

    @Test
    public void hasName() {
        assertEquals("Gareth Keenan", developer.getName());
    }

    @Test
    public void hasNINumber() {
        assertEquals("BG800813S", developer.getNationalInsuranceNumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(1500.00, developer.getSalary(), 0.1);
    }

    @Test
    public void canRaiseSalary() {
        developer.raiseSalary(150.00);
        assertEquals(1650.00, developer.getSalary(), 0.1);
    }

    @Test
    public void hasPayBonus() {
        assertEquals(15.00, developer.payBonus(), 0.1);
    }
}
