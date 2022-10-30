package Object_Array.J05024;

public class Query {
    private String queryText;
    private String queryID;

    public Query(String queryText) {
        this.queryText = queryText.toUpperCase();
    }

    public void toID() {
        String[] str = this.queryText.split("\\s+");
        this.queryID = String.valueOf(str[0].charAt(0)) + String.valueOf(str[1].charAt(0));
    }

    public String getQueryID() {
        return queryID;
    }

    @Override
    public String toString() {
        return this.queryText + ":";
    }
}
