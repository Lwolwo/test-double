package mock;

public class MockDoorPanel extends DoorPanel {
    private boolean wasCalled = false;

    @Override
    public void close() {
        this.wasCalled = true;
    }

    public boolean verifyMockDoorWasCalled() {
        return this.wasCalled;
    }
}
