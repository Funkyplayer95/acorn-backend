package day0912_01;

public class MaterialDTO {
    private String sMaterialName;
    private String sTypeName;
    private int iPrice;

    public MaterialDTO(){}
    public MaterialDTO(String sMaterialName, String sTypeName, int iPrice) {
        this.sMaterialName = sMaterialName;
        this.sTypeName = sTypeName;
    }

    public String getsMaterialName() {
        return sMaterialName;
    }

    public void setsMaterialName(String sMaterialName) {
        this.sMaterialName = sMaterialName;
    }

    public String getsTypeName() {
        return sTypeName;
    }

    public void setsTypeName(String sTypeName) {
        this.sTypeName = sTypeName;
    }
}
