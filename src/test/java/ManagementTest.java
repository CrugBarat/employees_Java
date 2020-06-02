import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class ManagementTest {

    Manager manager;

    @Before
    public void setUp() {
        manager = new Manager("David Brent", "OF412388F", 2400.00, "Sales");
    }

    @Test
    public void hasName() {
        assertEquals("David Brent", manager.getName());
    }

    @Test
    public void canSetName() {
        manager.setName("Tim Canterbury");
        assertEquals("Tim Canterbury", manager.getName());
    }

    @Test
    public void cantSetNameWithNull() {
        manager.setName(null);
        assertEquals("David Brent", manager.getName());
    }

    @Test
    public void hasNINumber() {
        assertEquals("OF412388F", manager.getNationalInsuranceNumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(2400.00, manager.getSalary(), 0.1);
    }

    @Test
    public void hasDepartmentName() {
        assertEquals("Sales", manager.getDeptName());
    }

    @Test
    public void canRaiseSalary() {
        manager.raiseSalary(240.00);
        assertEquals(2640.00, manager.getSalary(), 0.1);
    }

    @Test
    public void hasPayBonus() {
        assertEquals(24.00, manager.payBonus(), 0.1);
    }
}

