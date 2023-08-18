package com.acorn.inheritance;

public class TVChild extends AudioTVParent {
    private int size;
    // 오버라이딩용 필드
    // private boolean power1;
    
    public TVChild() { }

    public TVChild(boolean power, int volumn, int size) {
    	super(power, volumn);
    	this.size = size;
//    	this.power1 = true;
    }     

    public int getSize() { return size; }

    public void setSize(int size) {
         this.size = size;
    }

    public void watch() {
        String sOnOff = getPower() ? "Have fun" 
        		: "Switch on";
        System.out.println(sOnOff);
    }
//    메서드 오버로딩(overload)
//    public void watch(int count) {
//    	System.out.println("count: " + count);
//    }
    
//    메서드 오버라이드(override)
//    @Override
//    public boolean getPower() { return power1; } 
//    // override: 부모와 자식이 동일한 이름의 메소드를
//    // 가지고 있다면 자식클래스>부모클래스

}