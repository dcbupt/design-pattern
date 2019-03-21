import lombok.Data;

@Data
public class Person {

    private HairColor hairColor;
    private FaceColor faceColor;
    private Job job;

    public Person(Builder builder) {
        this.hairColor = builder.hairColor;
        this.faceColor = builder.faceColor;
        this.job = builder.job;
    }

    @Data
    public static class Builder {
        private HairColor hairColor;
        private FaceColor faceColor;
        private Job job;

        public Builder withHairColor(HairColor hairColor) {
            this.hairColor = hairColor;
            return this;
        }
        public Builder withFaceColor(FaceColor faceColor) {
            this.faceColor = faceColor;
            return this;
        }
        public Builder withJob(Job job) {
            this.job = job;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }
}
