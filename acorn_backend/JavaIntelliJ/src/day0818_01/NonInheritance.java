package day0818_01;

public class NonInheritance {
    private int iNonInheri;
    public NonInheritance() {}
    public NonInheritance(int iNonInheri){
        this.iNonInheri = iNonInheri;
    }

    public int getiNonInheri() {
        return iNonInheri;
    }

    public void setiNonInheri(int iNonInheri) {
        this.iNonInheri = iNonInheri;
    }
    public void printParentObj(){
        Parent parent = new Parent(1,2);
//        System.out.println(parent.parent01);
//        System.out.println(parent.parent02);
    }
}
