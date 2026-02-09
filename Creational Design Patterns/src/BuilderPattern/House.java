package BuilderPattern;

public class House {
    private final String foundation;
    private final String structure;
    private final String roof;
    private final boolean hasGarage;
    private final boolean hasSwimmingPool;
    private final boolean hasGarden;

    private House(HouseBuilder builder){
        this.foundation = builder.foundation;
        this.structure = builder.structure;
        this.roof = builder.roof;
        this.hasGarage = builder.hasGarage;
        this.hasGarden = builder.hasGarden;
        this.hasSwimmingPool = builder.hasSwimmingPool;
    }

    @Override
    public String toString() {
        return "House{" +
                "foundation='" + foundation + '\'' +
                ", structure='" + structure + '\'' +
                ", roof='" + roof + '\'' +
                ", hasGarage=" + hasGarage +
                ", hasSwimmingPool=" + hasSwimmingPool +
                ", hasGarden=" + hasGarden +
                '}';
    }

    public static class HouseBuilder{
        private final String foundation;
        private final String structure;
        private final String roof;
        private boolean hasGarage = true; ///NOTE: Default value false is set for everyone
        private boolean hasSwimmingPool;
        private boolean hasGarden;

        public HouseBuilder(String foundation, String structure, String roof){
            this.foundation = foundation;
            this.structure = structure;
            this.roof = roof;
        }
        public HouseBuilder setHasGarage(boolean hasGarage) {
            this.hasGarage = hasGarage;
            return this;
        }
        public HouseBuilder setHasSwimmingPool(boolean hasSwimmingPool) {
            this.hasSwimmingPool = hasSwimmingPool;
            return this;
        }
        public HouseBuilder setHasGarden(boolean hasGarden){
            this.hasGarden = hasGarden;
            return this;
        }
        public House build(){
            return new House(this);
        }
    }

}