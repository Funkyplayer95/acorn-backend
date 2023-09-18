package acorn_project.second_project;

public class StockInfoEntity {

    private String rawmaterialCode;
    private int rawmaterialQty;

    public StockInfoEntity(String rawmaterialCode, int rawmaterialQty) {
        this.rawmaterialCode = rawmaterialCode;
        this.rawmaterialQty = rawmaterialQty;
    }

    public String getRawmaterialCode() {
        return rawmaterialCode;
    }

    public void setRawmaterialCode(String rawmaterialCode) {
        this.rawmaterialCode = rawmaterialCode;
    }

    public int getRawmaterialQty() {
        return rawmaterialQty;
    }

    public void setRawmaterialQty(int rawmaterialQty) {
        this.rawmaterialQty = rawmaterialQty;
    }
}
