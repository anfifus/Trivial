public class Question {
    private String question;
    private boolean isCorrect;

    public Question(String question, boolean isCorrect) {
        this.question = question;
        this.isCorrect = isCorrect;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public boolean isCorrect() {
        return isCorrect;
    }

    public void setCorrect(boolean correct) {
        isCorrect = correct;
    }

    @Override
    public String toString() {
        return "Question{" +
                "question='" + question + '\'' +
                ", isCorrect=" + isCorrect +
                '}';
    }
}
