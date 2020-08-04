package mockito;

import org.junit.jupiter.api.*;
import org.mockito.*;
import stub.*;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GradeServiceTest {
    private GradeService gradeService;
    private GradeSystem stubGradeSystem;

    @BeforeEach
    public void setup() {
        stubGradeSystem = Mockito.mock(GradeSystem.class);
        gradeService = new GradeService(stubGradeSystem);
    }

    @Test
    public void shouldReturn90WhenCalculateStudentAverageGradeAndGradeIs80And90And100() {
        Mockito.when(stubGradeSystem.gradesFor(1000L)).thenReturn(Arrays.asList(80.0, 90.0, 100.0));
        assertEquals(90.0, gradeService.calculateAverageGrades(1000L));
        Mockito.verify(stubGradeSystem).gradesFor(1000L);

    }
}
