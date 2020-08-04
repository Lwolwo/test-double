package stub;

import java.util.*;

public class StubGradeSystem extends GradeSystem {
    @Override
    public List<Double> gradesFor(long studentId) {
        return Arrays.asList(80.0, 90.0, 100.0);
    }
}
