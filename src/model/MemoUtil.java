package model;

public class MemoUtil {
    private String memo;

    public MemoUtil(String memo) {
        this.memo = memo;
    }

    // Prints the memo
    public String printMemo() {
        return memo;
    }

    // Generates a greeting message
    public String greetings() {
        return "Hi " + memo + "!";
    }
    
    public int returnMemoLength() {
        return memo.length();
    }

}
