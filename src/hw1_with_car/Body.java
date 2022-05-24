package hw1_with_car;

public class Body {
    private String bodyType;
    private int bodyLength;

    @Override
    public String toString() {
        return "Body{" +
                "body Type is'" + bodyType + '\'' +
                ", bodyLength=" + bodyLength +
                '}';
    }

    public void additionBodyLength(int bodyLength){
        int newBodyLength = bodyLength+10;
        System.out.println("new body length is: "+newBodyLength+" cm");
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public int getBodyLength() {
        return bodyLength;
    }

    public void setBodyLength(int bodyLength) {
        this.bodyLength = bodyLength;
    }

    public Body(String bodyType, int bodyLength) {
        this.bodyType = bodyType;
        this.bodyLength = bodyLength;
    }
}
