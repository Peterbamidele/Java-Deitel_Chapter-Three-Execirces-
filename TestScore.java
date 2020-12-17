public class TestScore {
    private double score1;
    private double score2;
    private double score3;

    public TestScore(double score1, double score2, double score3){
        this.score1 = score1;
        this.score2 = score2;
        this.score3 = score3;
    }

    public TestScore() {

    }

    public void setScore1(double score1Given) {
        this.score1 = score1Given;
    }

    public double getScore1() {
        return score1;
    }

    public void setScore2(double score2Given) {
        this.score2 = score2Given;
    }

    public double getScore2() {
        return score2;
    }

    public void setScore3(double score3Given) {
        this.score3 = score3Given;
    }

    public double getScore3() {
        return score3;
    }
    public double calculateAverage() {
        return (score1 + score2 + score3)/3;
    }
}
