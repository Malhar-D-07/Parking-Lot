package Strategy;

import Models.SlotAssignmentStrategyEnum;

public class GetSlotFactory  {

    public static SlotAssignmentStrategy getSlotStrategy(SlotAssignmentStrategyEnum strategy) {
        if(strategy.equals(SlotAssignmentStrategyEnum.RANDOM)) {
            return new RandomSlotGenerator();
        }
        return null;
    }
}
