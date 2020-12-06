package baseball;

public enum GameStatus {
    RESTART("1"), EXIT("2");
    private String status;

    GameStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}