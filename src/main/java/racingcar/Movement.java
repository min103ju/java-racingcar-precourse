package racingcar;

/**
 * author : citizen103
 */
public class Movement {

    private final int MOVE_CONDITION_NUM = 4;
    private int movement = 0;

    public void isMove(int condition) {
        if (MOVE_CONDITION_NUM <= condition) {
            movement++;
        }
    }

    public boolean isMovementSame(int askNum) {
        return movement == askNum;
    }
}
