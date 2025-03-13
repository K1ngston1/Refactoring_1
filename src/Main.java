public class Main {
    public static void main(String[] args) {
        HumanIMB human = new HumanIMB(80, 1.52);
        System.out.println("ІМТ: " + human.getIMB());
        System.out.println("Результат: " + human.getResult());

        System.out.println("Вага: " + human.getWeight());
        System.out.println("Зріст: " + human.getHeight());
    }
}

class HumanIMB {
    private double weight;
    private double height;

    public HumanIMB(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getIMB() {
        return weight / (height * height);
    }

    public String getResult() {
        double imb = getIMB();
        if (imb < 18.5) {
            return "Deficit";
        } else if (imb < 25) {
            return "Norm";
        } else if (imb < 30) {
            return "Warning!";
        } else {
            return "Fat";
        }
    }
}
