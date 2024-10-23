import java.util.Random;

public class GenerateAngka {
    private Integer number;

    public GenerateAngka() {
        this.number = generateNumber();
    }

    public Integer getNumber() {
        return this.number;
    }

    private Integer generateNumber() {
        Random random = new Random();
        return random.nextInt(10);
    }
}
