public class CodeWordChecker implements StringChecker {

    private int min;
    private int max;
    private String not;

    public CodeWordChecker(int min, int max, String str){
        this.min=min;
        this.max=max;
        this.not=not;
    }

    public CodeWordChecker (String str){
        this.min=6;
        this.max=20;
        this.not=not;
    }

    @Override
    public boolean isValid(String str) {
        if (str.length()>this.max || str.length()<this.min || str.indexOf(this.not)!=-1){
            return false;
        }
        return true;
    }
}
