import org.junit.Before;
import org.junit.Test;
import staff.techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void setUp() {
        databaseAdmin = new DatabaseAdmin("Dawn Tinsley", "DW129856X", 1200.00);
    }

    @Test
    public void hasName() {
        assertEquals("Dawn Tinsley", databaseAdmin.getName());
    }

    @Test
    public void canSetName() {
        databaseAdmin.setName("Tim Canterbury");
        assertEquals("Tim Canterbury", databaseAdmin.getName());
    }

    @Test
    public void cantSetNameWithNull() {
        databaseAdmin.setName(null);
        assertEquals("Dawn Tinsley", databaseAdmin.getName());
    }

    @Test
    public void hasNINumber() {
        assertEquals("DW129856X", databaseAdmin.getNationalInsuranceNumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(1200.00, databaseAdmin.getSalary(), 0.1);
    }

    @Test
    public void canRaiseSalary() {
        databaseAdmin.raiseSalary(120.00);
        assertEquals(1320.00, databaseAdmin.getSalary(), 0.1);
    }

    @Test
    public void salaryUnaffectedByNegativeValueInput() {
        databaseAdmin.raiseSalary(-120.00);
        assertEquals(1200.00, databaseAdmin.getSalary(), 0.1);
    }

    @Test
    public void hasPayBonus() {
        assertEquals(12.00, databaseAdmin.payBonus(), 0.1);
    }
}
