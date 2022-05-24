package hw1_with_car;

public class Helm {
    private String helmName;
    private int helmDiameter;

    @Override
    public String toString() {
        return "Helm {" +
                "helm Name is' " + helmName + '\'' +
                ", helm Diameter=" + helmDiameter +
                '}';
    }

    public void multiplicationDiameter(int helmDiameter){
        int newDiameter = helmDiameter*2;
        System.out.println("new helm diameter is: "+newDiameter);
    }

    public String getHelmName() {
        return helmName;
    }

    public void setHelmName(String helmName) {
        this.helmName = helmName;
    }

    public int getHelmDiameter() {
        return helmDiameter;
    }

    public void setHelmDiameter(int helmDiameter) {
        this.helmDiameter = helmDiameter;
    }

    public Helm(String helmName, int helmDiameter) {
        this.helmName = helmName;
        this.helmDiameter = helmDiameter;
    }

}
