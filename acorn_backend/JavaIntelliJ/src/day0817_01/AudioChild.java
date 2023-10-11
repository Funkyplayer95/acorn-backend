package com.acorn.inheritance;

public class AudioChild extends AudioTVParent {

    public AudioChild() { }
    
    public AudioChild(boolean power, int volumn) {
    	super(power, volumn);
    }
    
    public void tune() {
    	String sOnOff = getPower() ?  "ha ha ha..." : "turn it on";
        System.out.println(sOnOff);
    }
}