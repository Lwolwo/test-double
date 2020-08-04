package mockito;

import mock.*;
import org.junit.jupiter.api.*;
import org.mockito.*;

public class SecurityCenterTest {
    private SecurityCenter securityCenter;
    private DoorPanel mockDoorPanel;

    @BeforeEach
    public void setup() {
        mockDoorPanel = Mockito.mock(DoorPanel.class);
        securityCenter = new SecurityCenter(mockDoorPanel);
    }
    @Test
    public void shouldVerifyDoorIsClosed() {
        securityCenter.switchOn();
        Mockito.verify(mockDoorPanel, Mockito.times(1)).close();
    }
}

