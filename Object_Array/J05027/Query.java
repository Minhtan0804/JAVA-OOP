package Object_Array.J05027;

public class Query {
    private String keyWord;

    public Query(String keyWord) {
        this.keyWord = keyWord;
    }

    public String getKeyWord() {
        return keyWord.toLowerCase();
    }

    @Override
    public String toString() {
        return String.format("DANH SACH GIANG VIEN THEO TU KHOA %s:", this.keyWord);
    }
}
