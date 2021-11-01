package designpatterns.builder;

public class Phone {

    public static class Builder {
        private String backPanel;
        private String frontPanel;
        private String processor;
        private String camera;

        public Builder() {

        }

        public Phone build() {
            return new Phone(this);
        }

        public Builder backPanel(String backPanel) {
            this.backPanel = backPanel;
            return this;
        }

        public Builder frontPanel(String frontPanel) {
            this.frontPanel = frontPanel;
            return this;
        }

        public Builder processor(String processor) {
            this.processor = processor;
            return this;
        }

        public Builder camera(String camera) {
            this.camera = camera;
            return this;
        }
    }

    private String backPanel;
    private String frontPanel;
    private String processor;
    private String camera;

    private Phone(Builder builder) {
        this.frontPanel = builder.frontPanel;
        this.backPanel = builder.backPanel;
        this.processor = builder.processor;
        this.camera = builder.camera;
    }

    public String getBackPanel() {
        return backPanel;
    }

    public String getFrontPanel() {
        return frontPanel;
    }

    public String getProcessor() {
        return processor;
    }

    public String getCamera() {
        return camera;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "backPanel='" + backPanel + '\'' +
                ", frontPanel='" + frontPanel + '\'' +
                ", processor='" + processor + '\'' +
                ", camera='" + camera + '\'' +
                '}';
    }
}
