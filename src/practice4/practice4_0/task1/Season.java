package practice4.practice4_0.task1;

public enum Season {
    WINTER (5),
    SPRING (10),
    SUMMER (15) {
        @Override
        public String getDescription() {
            return "Теплое время года";
        }
    },
    AUTUMN (8);

    private final int meanTemp;
    private Season (int meanTemp) {
        this.meanTemp = meanTemp;
    }

    public int getMeanTemp() {
        return meanTemp;
    }

    public String getDescription() {
        return "Холодное время года";
    }
}
